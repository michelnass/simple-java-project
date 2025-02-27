package main.java.com.example;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello from Jenkins!");
    }

    public static String getMessage() {
        return "Hello from Jenkins 3!";
    }
    
    /**
     * Calculate BMI using weight in kilograms and height in centimeters
     * @param weightKg weight in kilograms
     * @param heightCm height in centimeters
     * @return BMI value
     */
    public static double calculateBmi(double weightKg, double heightCm) {
        if (heightCm <= 0 || weightKg <= 0) {
            throw new IllegalArgumentException("Weight and height must be positive values");
        }
        // Convert centimeters to meters for the BMI formula
        double heightM = heightCm / 100.0;
        return weightKg / (heightM * heightM);
    }
    
    /**
     * Calculate BMI using weight in pounds and height in inches
     * @param weightLbs weight in pounds
     * @param heightInches height in inches
     * @return BMI value
     */
    public static double calculateBmiImperial(double weightLbs, double heightInches) {
        if (heightInches <= 0 || weightLbs <= 0) {
            throw new IllegalArgumentException("Weight and height must be positive values");
        }
        // BMI = (weight in pounds * 703) / (height in inches)²
        return (weightLbs * 703) / (heightInches * heightInches);
    }
    
    /**
     * Get BMI category based on BMI value
     * @param bmi BMI value
     * @return category description
     */
    public static String getBmiCategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
