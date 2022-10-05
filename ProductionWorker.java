import java.text.DecimalFormat;

public class ProductionWorker extends Employee{
    private int workShift;
    private double payRate;
    private final int DAY = 1;
    private final int NIGHT = 2;
    
    public ProductionWorker(){
        super();
        workShift = DAY;
        payRate = 0;
    }
    
    public ProductionWorker(String name, String number, String date, 
                            int shift, double rate)
    {
        super(name,number,date);
        workShift = shift;
        payRate = rate;
    }
    
    public void setShift(int s){
        workShift = s;
    }
    
    public void setRate(int r){
        payRate = r;
    }
    
    public int getShift(){
        return workShift;
    }
    
    public double getRate(){
        return payRate;
    }
    
    public String toString(){
        String s = super.toString();
        
        DecimalFormat formatter = new DecimalFormat("$#0.00");
        
        s += "\nShift: ";
        if(workShift == DAY)
            s += "Day";
        else if(workShift == NIGHT)
            s += "Night";
        else
            s += "INVALID SHIFT";
        s += "\nHourly Pay Rate: " + formatter.format(payRate);
        
        return s;
    }
}
