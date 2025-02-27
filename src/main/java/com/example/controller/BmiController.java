package main.java.com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import main.java.com.example.model.BmiForm;
import main.java.com.example.model.BmiRecord;
import main.java.com.example.service.BmiService;

import java.util.List;

@Controller
public class BmiController {

    private final BmiService bmiService;

    @Autowired
    public BmiController(BmiService bmiService) {
        this.bmiService = bmiService;
    }

    @GetMapping("/")
    public String showForm(Model model) {
        BmiForm bmiForm = new BmiForm();
        bmiForm.setUnit("metric"); // Default to metric
        model.addAttribute("bmiForm", bmiForm);
        return "index";
    }

    @PostMapping("/calculate")
    public String calculateBmi(@ModelAttribute BmiForm bmiForm, Model model) {
        try {
            bmiService.calculateBmi(bmiForm);
            model.addAttribute("bmiForm", bmiForm);
            return "result";
        } catch (IllegalArgumentException e) {
            model.addAttribute("error", e.getMessage());
            model.addAttribute("bmiForm", bmiForm);
            return "index";
        }
    }
    
    @GetMapping("/calculate")
    public String redirectToHome() {
        return "redirect:/";
    }
    
    @GetMapping("/history")
    public String showHistory(Model model) {
        List<BmiRecord> records = bmiService.getAllBmiRecords();
        model.addAttribute("records", records);
        return "history";
    }
}