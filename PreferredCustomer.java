import java.text.DecimalFormat;

public class PreferredCustomer extends Customer{
    private double cPurchases;
    private int cDiscount;
    
    public PreferredCustomer(){
        super();
        cPurchases = 0.0;
        cDiscount = 0;
    }
    public PreferredCustomer(String name, String address, String phone,
                             String customer, int mailing, double purchases){
        super(name,address,phone,customer,mailing);
        cPurchases = purchases;
        cDiscount = 0;
    }
    
    public void setPurchases(double p){
        cPurchases = p;
    }
    
    public double getPurchases(){
        return cPurchases;
    }
    
    public double getDiscount(){
        if(cPurchases >= 500 && cPurchases < 1000)
            cDiscount = 5;
        if(cPurchases >= 1000 && cPurchases < 1500)
            cDiscount = 6;
        if(cPurchases >= 1500 && cPurchases < 2000)
            cDiscount = 7;
        if(cPurchases >= 2000)
            cDiscount = 10;
        return cDiscount;
    }
    
    public String toString(){
        DecimalFormat formatter = new DecimalFormat("$#0.00");
        
        String s = super.toString();
        s += "\nPurchase Amount: " + formatter.format(cPurchases);
        s += "\nDiscount: " + getDiscount() + "%";
        
        return s;
    }
}
