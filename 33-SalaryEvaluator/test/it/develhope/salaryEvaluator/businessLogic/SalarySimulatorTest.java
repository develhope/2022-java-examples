package it.develhope.salaryEvaluator.businessLogic;

import it.develhope.salaryEvaluator.entities.SalaryData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Map;

public class SalarySimulatorTest {


    @ParameterizedTest
    @ValueSource(doubles = {10000,20000,30000,40000,50000,60000,70000,80000,90000,10000})
    @Tag("Simulation")
    public void EvaluateSalary(double grossAnnualSalary) throws Exception{
        SalarySimulator salarySimulator = new SalarySimulator(grossAnnualSalary);
        salarySimulator.calculate();

        SalaryData annualData = salarySimulator.getAnnualData();

        Map<Integer, SalaryData> simulation = salarySimulator.getMonthlySalary();

        SalaryData lastMonthData = simulation.get(13);
        Assertions.assertTrue(Math.abs(annualData.getInps() - lastMonthData.getInps()) <0.001);
        Assertions.assertTrue(Math.abs(annualData.getIrpef() - lastMonthData.getIrpef()) <0.001);
        Assertions.assertTrue(Math.abs(annualData.getTfr() - lastMonthData.getTfr()) <0.001) ;
        Assertions.assertTrue(Math.abs(annualData.getNet() - lastMonthData.getNet()) <0.001) ;
    }

    @Test
    public void negativeGrossSalary(){
        try {
            SalarySimulator salarySimulator = new SalarySimulator(-50000);
            salarySimulator.calculate();
            Assertions.fail();
        }catch (Exception e){
            Assertions.assertTrue(true);
        }

    }
}
