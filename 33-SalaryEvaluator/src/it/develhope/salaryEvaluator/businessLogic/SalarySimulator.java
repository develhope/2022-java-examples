package it.develhope.salaryEvaluator.businessLogic;

import it.develhope.salaryEvaluator.entities.SalaryData;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;

public class SalarySimulator {


    final private double grossSalaryAnnual;

    SalaryCalculator salaryCalculator = new SalaryCalculator();

    @Getter
    private Map<Integer, SalaryData> monthlySalary;

    @Getter
    private SalaryData annualData;

    @Getter
    private SalaryData monthlyData;

    public SalarySimulator(double grossSalaryAnnual) throws Exception{
        if(grossSalaryAnnual <= 0)  throw new Exception("Only positive salaries");
        this.grossSalaryAnnual = grossSalaryAnnual;
    }

    /**
     * Calcualtes all the taxes
     */
    public void calculate(){
        this.init();
        //Evaluate Annual taxes
        this.annualData = this.salaryCalculator.evaluateTaxesAnnual(grossSalaryAnnual);

        this.monthlyData = annualData.clone();
        this.monthlyData.divideAll(13);

        //Monthly evaluations
        for(int i = 1; i <= 13; i++){
            SalaryData sd = this.monthlyData.clone();
            if(i != 1){
                SalaryData salaryDataLastMonth = monthlySalary.get(i-1);
                sd.add(salaryDataLastMonth);
                monthlySalary.put(i, sd);
            }
            monthlySalary.put(i, sd);
        }
    }

    private void init(){
        monthlySalary = new HashMap<>();
    }
}
