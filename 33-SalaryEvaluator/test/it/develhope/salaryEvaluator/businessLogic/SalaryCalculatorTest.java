package it.develhope.salaryEvaluator.businessLogic;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class SalaryCalculatorTest {

    private static SalaryCalculator salaryCalculator;

    @BeforeAll
    public static void beforeAllTests(){
        salaryCalculator = new SalaryCalculator();
    }

    /*@BeforeEach
    public void beforeEachTest(){
        System.out.println("--------- Before each test --------");
    }*/


    @Test
    @Tag("TFR")
    public void evaluateTFR(){
        double TFR = salaryCalculator.evaluateTFR(30000); //Must be 2073
        Assertions.assertTrue(TFR > 0);
        //Assertions.assertEquals(2073, TFR);
        Assertions.assertTrue(Math.abs(2073 - TFR)< 0.01);
    }

    @Test
    @Tag("TFR")
    public void evaluateTFRNegativeSalary(){
        double TFR = salaryCalculator.evaluateTFR(-30000); //Must be 2073
        Assertions.assertTrue(TFR < 0);
    }

    @ParameterizedTest
    @ValueSource(doubles = {30000, 50000, 10000})
    @Tag("TFR")
    public void evaluateTFRParametrized(double grossSalary){
        double TFR = salaryCalculator.evaluateTFR(grossSalary);
        Assertions.assertTrue(TFR > 0);
    }

    @Test
    @Tag("INPS")
    public void evaluateINPS(){
        double INPS = salaryCalculator.evaluateINPS(30000); //Must be 2073
        Assertions.assertTrue(INPS > 0);
        //Assertions.assertEquals(2073, TFR);
        Assertions.assertTrue(Math.abs(2757 - INPS)< 0.01);
    }

    @Test
    @Tag("INPS")
    public void evaluateINPSNegativeSalary(){
        double INPS = salaryCalculator.evaluateINPS(-30000); //Must be 2073
        Assertions.assertTrue(INPS < 0);
    }

    @ParameterizedTest
    @ValueSource(doubles = {30000, 50000, 10000})
    @Tag("INPS")
    public void evaluateINPSParametrized(double grossSalary){
        double INPS = salaryCalculator.evaluateINPS(grossSalary);
        Assertions.assertTrue(INPS > 0);
    }

    @Test
    @Tag("IRPEF")
    public void evaluateIRPEFCalculation(){
        double taxes = salaryCalculator.calculateIRPEF(10000, 23.0);
        Assertions.assertEquals(2300, taxes);
        Assertions.assertFalse(taxes <0);
    }

    @Test
    @Tag("IRPEF")
    public void evaluateIRPEFCalculationAdvanced(){
        double taxes = salaryCalculator.calculateIRPEF(30000, 23.0, 5000, 2000);
        Assertions.assertEquals(7750, taxes);
        Assertions.assertFalse(taxes <0);
    }

    @ParameterizedTest
    @Tag("IRPEF")
    @CsvSource({
            "10000, 2300",
            "20000, 4800",
            "30000, 7720",
            "40000, 11520",
            "50000, 15320",
            "60000, 19270",
            "70000, 23370",
            "80000, 27570",
            "90000, 31870",
            "100000, 36170",
    })
    public void evaluateIRPEFComplete(double annualSalaryGross, double expectedSalary){
        double taxes = salaryCalculator.evaluateIRPEF(annualSalaryGross);
        Assertions.assertEquals(expectedSalary, taxes);
        Assertions.assertFalse(taxes <0);
    }
}
