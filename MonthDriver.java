public class MonthDriver {
    public static void main(String[] args){
        
        Month month1 = null;
        try{
        month1 = new Month(6);
        }
        catch(InvalidNumberException ine){
            System.out.println("Month Error: " + ine);
        }
        
        Month month2 = null;
        try{
        month2 = new Month("february");
        }
        catch(InvalidStringException ise){
            System.out.println("Month Error: " + ise);
        }
        
        if(month1 != null && month2 != null){
            if(month1.greaterThan(month2))
                System.out.println(month1 + " is greater than " + month2);
            else if(month1.lessThan(month2))
                System.out.println(month1 + " is less than " + month2);
            else if(month1.equals(month2))
                System.out.println(month1 + " is equal to " + month2);
        }
        
        Month month3 = null;
        try{
        month3 = new Month(13);
        }
        catch(InvalidNumberException ine){
            System.out.println("Month Error: " + ine);
        }
        
        Month month4 = null;
        try{
        month4 = new Month("jan");
        }
        catch(InvalidStringException ise){
            System.out.println("Month Error: " + ise);
        }
        
        if(month3 != null && month4 != null){
            if(month3.greaterThan(month4))
                System.out.println(month3 + " is greater than " + month4);
            else if(month3.lessThan(month4))
                System.out.println(month3 + " is less than " + month4);
            else if(month3.equals(month4))
                System.out.println(month3 + " is equal to " + month4);
        }
    }
}
