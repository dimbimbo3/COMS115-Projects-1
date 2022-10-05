import java.util.StringTokenizer;

public class SalesAnalysis {
    private String sales;
    
    public SalesAnalysis(String s){
        sales = s;
    }
    
    public double getSalesTotal(){
        double total = 0;
        System.out.println("test");
        StringTokenizer tokenizer = new StringTokenizer(sales, ",");
        
        while(tokenizer.hasMoreTokens()){
            String num = tokenizer.nextToken();
            total += Double.parseDouble(num);
        }
        return total;
    }
    
    private int getDays(){
        System.out.println("getdays");
        int days = 0;
        StringTokenizer tokenizer = new StringTokenizer(sales, ",");
        days = tokenizer.countTokens();
        
        return days;
    }
    
    public double getDailyAverage(){
        System.out.println("getdailyaverage");
        double average = getSalesTotal() / getDays();
        return average;
    }
}
