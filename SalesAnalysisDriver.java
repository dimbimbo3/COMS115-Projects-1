import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class SalesAnalysisDriver {
    public static void main(String[] args)throws Exception{
        File fin = new File("SalesData.txt");
        Scanner input = new Scanner(fin);
        ArrayList<String> sales = new ArrayList();
        
        while(input.hasNext()){
            sales.add(input.nextLine());
        }
        System.out.println("test" + sales.size());
        
        int totalSales = 0;
        int maxWeek = 0;
        int minWeek = 0;
        double maxAmount = 0;
        double minAmount = 0;
        for(int i = 0; i < sales.size(); i++){
            String temp = sales.get(i);
            SalesAnalysis week = new SalesAnalysis(temp);
            System.out.println("before");
            System.out.println("Week #" + (i + 1) + " Sales: " + week.getSalesTotal()
                                + "\t" + "Week #" + (i + 1) + " Average Daily Sales: " 
                                + week.getDailyAverage());
            System.out.println("after");
            totalSales += week.getSalesTotal();
            if(i == 0){
                maxWeek = i+1;
                minWeek = i+1;
                maxAmount = week.getSalesTotal();
                minAmount = week.getSalesTotal();
            }
            else{
                if(week.getSalesTotal() < minAmount){
                    minAmount = week.getSalesTotal();
                    minWeek = i+1;
                }
                else if(week.getSalesTotal() > maxAmount){
                    maxAmount = week.getSalesTotal();
                    maxWeek = i+1;
                }    
            }    
        }
        
        System.out.println("Total sales for all weeks: " + totalSales);
        
        int average = totalSales / sales.size();
        
        System.out.println("Average Weekly Sales: " + average);
        
        System.out.println("Max Week #" + maxWeek + "Highest amount:" + maxAmount);
        System.out.println("Min Week #" + minWeek + "Lowest amount:" + minAmount);
    }
}
