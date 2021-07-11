package com.example.ict600_bmi_calculator;

public class BMICal {

    public static final BMICal instance = new BMICal();

    private static final int CENTIMETERS_IN_METER = 100;
    private static final int INCHES_IN_FOOT = 12;
    private static final int BMI_IMPERIAL_WEIGHT_SCALAR = 703;

    public static final String BMI_CATEGORY_UNDERWEIGHT = "BMI Category: Underweight | Health Risk: Malnutrition Risk";
    public static final String BMI_CATEGORY_HEALTHY = "BMI Category: Normal Weight | Health Risk: Low Risk";
    public static final String BMI_CATEGORY_OVERWEIGHT = "BMI Category: Overweight | Health Risk: Enhanced Risk";
    public static final String BMI_CATEGORY_OBESE = "BMI Category: Moderately Obese | Health Risk: Medium Risk";
    public static final String BMI_CATEGORY_OBESE1 = "BMI Category: Severely Obese | Health Risk: High Risk";
    public static final String BMI_CATEGORY_OBESE2 = "BMI Category: Very Severely Obese | Health Risk: Very High Risk";

    public static BMICal getInstance() {
        return instance;
    }

    public double calculateBMIMetric(double heightCm, double weightKg) {
        return (weightKg / ((heightCm / CENTIMETERS_IN_METER) * (heightCm / CENTIMETERS_IN_METER)));
    }

    public double calculateBMIImperial(double heightFeet, double heightInches, double weightLbs) {
        double totalHeightInInches = (heightFeet * INCHES_IN_FOOT) + heightInches;
        return (BMI_IMPERIAL_WEIGHT_SCALAR * weightLbs) / (totalHeightInInches * totalHeightInInches);
    }

    public String classifyBMI(double bmi) {
        if (bmi < 18.5) {
            return BMI_CATEGORY_UNDERWEIGHT;
        } else if (bmi >= 18.5 && bmi < 25) {
            return BMI_CATEGORY_HEALTHY;
        } else if (bmi >= 25 && bmi < 30){
            return BMI_CATEGORY_OVERWEIGHT;
        } else if (bmi >= 30 && bmi < 35){
            return BMI_CATEGORY_OBESE;
        } else if (bmi >= 35 && bmi < 40){
            return BMI_CATEGORY_OBESE1;
        } else {
            return BMI_CATEGORY_OBESE2;
        }
    }

}
