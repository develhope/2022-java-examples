package it.develhope.salaryEvaluator.entities;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class SalaryData implements Cloneable {

    /** Net salary */
    private double net;
    /** IRPEF Tax **/
    private double irpef;
    /** INPS Tax **/
    private double inps;
    /** TFR Tax **/
    private double tfr;

    public void divideAll(int months){
        this.net /= months;
        this.irpef /= months;
        this.inps /= months;
        this.tfr /= months;
    }

    @Override
    public SalaryData clone() {
        try {
            return (SalaryData) super.clone();
        }catch(Exception e){
            System.out.println("Clone failed");
            return  new SalaryData();
        }
    }

    public void add(SalaryData salaryData) {
        this.net += salaryData.getNet();
        this.irpef += salaryData.getIrpef();
        this.inps += salaryData.getInps();
        this.tfr += salaryData.getTfr();
    }
}
