package it.develhope.salaryEvaluator.businessLogic;

import it.develhope.salaryEvaluator.entities.SalaryData;

class SalaryCalculator {

    /**
     * Evaluates TFR from salary
     * @param grossAnnualSalary Salary before taxes
     * @return the TFR
     */
    protected double evaluateTFR(double grossAnnualSalary){
        return grossAnnualSalary * 6.91 / 100;
    }

    /**
     * Evaluates INPS from salary
     * @param grossAnnualSalary Salary before taxes
     * @return the INPS taxes
     */
    protected double evaluateINPS(double grossAnnualSalary){
        return grossAnnualSalary * 9.19 / 100;
    }

    /**
     * Evaluates IRPEF from salary
     * @param grossAnnualSalary Salary before taxes
     * @return the IRPEF taxes
     */
    protected double evaluateIRPEF(double grossAnnualSalary){
        if(grossAnnualSalary <= 15000){
            return calculateIRPEF(grossAnnualSalary, 23) ;
        }else if(grossAnnualSalary <= 28000){
            return calculateIRPEF(grossAnnualSalary, 27, 15000, 3450);
        }else if(grossAnnualSalary <= 55000){
            return calculateIRPEF(grossAnnualSalary, 38, 28000, 6960);
        }else if(grossAnnualSalary <= 75000){
            return calculateIRPEF(grossAnnualSalary, 41, 55000, 17220);
        }else{
            return calculateIRPEF(grossAnnualSalary, 43, 75000, 25420);
        }
    }

    /**
     * Calculates the IRPEF with math formula
     * @param grossAnnualSalary  Salary ANNUAL before taxes
     * @param percentage IRPEF percentage
     * @return IRPEF
     */
    protected double calculateIRPEF(double grossAnnualSalary, double percentage){
        return calculateIRPEF(grossAnnualSalary, percentage, 0,0);
    }

    /**
     * Calculates the IRPEF with math formula
     * @param grossAnnualSalary  Salary ANNUAL before taxes
     * @param percentage IRPEF percentage
     * @param deltaTax Salary to be removed
     * @param baseTax Fixed tax
     * @return IRPEF
     */
    protected double calculateIRPEF(double grossAnnualSalary, double percentage, double deltaTax, double baseTax){
        return percentage / 100.0 *  (grossAnnualSalary - deltaTax) + baseTax;
    }

    public SalaryData evaluateTaxesAnnual(double grossAnnualSalary){
        SalaryData out = new SalaryData();
        out.setInps(evaluateINPS(grossAnnualSalary));
        out.setIrpef(evaluateIRPEF(grossAnnualSalary));
        out.setTfr(evaluateTFR(grossAnnualSalary));

        out.setNet(grossAnnualSalary - out.getInps() - out.getIrpef() - out.getTfr());
        return out;
    }
}
