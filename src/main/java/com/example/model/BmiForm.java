package main.java.com.example.model;

public class BmiForm {
    
    private Double weight;
    private Double height;
    private String unit; // "metric" or "imperial"
    private Double bmiResult;
    private String bmiCategory;
    
    public BmiForm() {
        // Default constructor
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
}