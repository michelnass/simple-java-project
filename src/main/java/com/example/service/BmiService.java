package main.java.com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import main.java.com.example.HelloWorld;
import main.java.com.example.model.BmiForm;
import main.java.com.example.model.BmiRecord;
import main.java.com.example.repository.BmiRecordRepository;

import java.util.List;

@Service
public class BmiService {

    private final BmiRecordRepository bmiRecordRepository;

    @Autowired
    public BmiService(BmiRecordRepository bmiRecordRepository) {
        this.bmiRecordRepository = bmiRecordRepository;
    }

    public void calculateBmi(BmiForm bmiForm) {
        double bmiValue;
        
        if ("metric".equals(bmiForm.getUnit())) {
            bmiValue = HelloWorld.calculateBmi(bmiForm.getWeight(), bmiForm.getHeight());
        } else {
            bmiValue = HelloWorld.calculateBmiImperial(bmiForm.getWeight(), bmiForm.getHeight());
        }
        
        // Round to 2 decimal places
        bmiValue = Math.round(bmiValue * 100.0) / 100.0;
        
        bmiForm.setBmiResult(bmiValue);
        bmiForm.setBmiCategory(HelloWorld.getBmiCategory(bmiValue));
        
        // Save the calculation to the database
        BmiRecord record = new BmiRecord(bmiForm);
        bmiRecordRepository.save(record);
    }
    
    public List<BmiRecord> getAllBmiRecords() {
        return bmiRecordRepository.findAllByOrderByCalculatedAtDesc();
    }
}