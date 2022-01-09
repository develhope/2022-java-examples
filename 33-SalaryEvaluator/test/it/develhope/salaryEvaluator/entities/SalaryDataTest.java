package it.develhope.salaryEvaluator.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * The type Salary data test.
 */
public class SalaryDataTest {

    /**
     * Divide test.
     */
    @Test
    public void divideTest(){
        SalaryData salaryData = new SalaryData();
        salaryData.setNet(15000);
        salaryData.setIrpef(1000);
        salaryData.setTfr(500);
        salaryData.setInps(2000);

        salaryData.divideAll(2);

        Assertions.assertEquals(7500, salaryData.getNet());
        Assertions.assertEquals(500, salaryData.getIrpef());
        Assertions.assertEquals(250, salaryData.getTfr());
        Assertions.assertEquals(1000, salaryData.getInps());
    }

    /**
     * Add test.
     */
    @Test
    public void addTest(){
        SalaryData salaryData = new SalaryData();
        salaryData.setNet(15000);
        salaryData.setIrpef(1000);
        salaryData.setTfr(500);
        salaryData.setInps(2000);

        SalaryData salaryDataAdd = new SalaryData();
        salaryDataAdd.setNet(1000);
        salaryDataAdd.setIrpef(1000);
        salaryDataAdd.setTfr(1000);
        salaryDataAdd.setInps(1000);

        salaryData.add(salaryDataAdd);

        Assertions.assertEquals(16000, salaryData.getNet());
        Assertions.assertEquals(2000, salaryData.getIrpef());
        Assertions.assertEquals(1500, salaryData.getTfr());
        Assertions.assertEquals(3000, salaryData.getInps());
    }
}
