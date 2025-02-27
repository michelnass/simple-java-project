package main.java.com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class BmiRecord {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Double weight;
    private Double height;
    private String unit;
    private Double bmiResult;
    private String bmiCategory;
    private LocalDateTime calculatedAt;
    
    public BmiRecord() {
        // Default constructor required by JPA
    }
    
    public BmiRecord(BmiForm bmiForm) {
        this.weight = bmiForm.getWeight();
        this.height = bmiForm.getHeight();
        this.unit = bmiForm.getUnit();
        this.bmiResult = bmiForm.getBmiResult();
        this.bmiCategory = bmiForm.getBmiCategory();
        this.calculatedAt = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getBmiResult() {
        return bmiResult;
    }

    public void setBmiResult(Double bmiResult) {
        this.bmiResult = bmiResult;
    }

    public String getBmiCategory() {
        return bmiCategory;
    }

    public void setBmiCategory(String bmiCategory) {
        this.bmiCategory = bmiCategory;
    }

    public LocalDateTime getCalculatedAt() {
        return calculatedAt;
    }

    public void setCalculatedAt(LocalDateTime calculatedAt) {
        this.calculatedAt = calculatedAt;
    }
}