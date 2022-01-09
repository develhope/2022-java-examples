package it.develhope.salaryEvaluator;

import it.develhope.salaryEvaluator.businessLogic.SalarySimulator;

public class Start {

    public static void main(String[] args) throws Exception{
        System.out.println("======================================");
        System.out.println("=========== Salary Evaluator =========");
        System.out.println("======================================");

        double grossSalaryAnnual = 50000;
        System.out.println("Gross annual salary " + grossSalaryAnnual + " €");

        SalarySimulator salarySimulator = new SalarySimulator(grossSalaryAnnual);
        salarySimulator.calculate();

        System.out.println("Annual Data: " + salarySimulator.getAnnualData().toString());
        System.out.println("Monthly Data: " + salarySimulator.getMonthlyData().toString());

        System.out.println(" == Monthly data == ");
        salarySimulator.getMonthlySalary().forEach((month, salaryData) -> {
            System.out.println("Month " + month + ": " +  salaryData.toString());
        });

    }
}
