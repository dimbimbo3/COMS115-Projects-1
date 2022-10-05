public class Month {
    private int monthNumber;
    
    public Month(){
        monthNumber = 1;
    }
    
    public Month(int num)throws InvalidNumberException{
        monthNumber = num;
        
        if(num < 1 || num > 12)
            throw new InvalidNumberException("Error: " +
                    "A number less than 1 or greater than 12 is given for the month number.");
    }
    
    public Month(String month)throws InvalidStringException{
        switch(month){
            case "january":
            case "January":
                monthNumber = 1;
                break;
            case "february":
            case "February":
                monthNumber = 2;
                break;
            case "march":
            case "March":
                monthNumber = 3;
                break;
            case "april":
            case "April":
                monthNumber = 4;
                break;
            case "may":
            case "May":
                monthNumber = 5;
                break;
            case "june":
            case "June":
                monthNumber = 6;
                break;
            case "july":
            case "July":
                monthNumber = 7;
                break;
            case "august":
            case "August":
                monthNumber = 8;
                break;
            case "september":
            case "September":
                monthNumber = 9;
                break;
            case "october":
            case "October":
                monthNumber = 10;
                break;
            case "november":
            case "November":
                monthNumber = 11;
                break;
            case "december":
            case "December":
                monthNumber = 12;
                break;
            default:
                throw new InvalidStringException("Error: " +
                        "An invalid string is given for the name of the month");
        }
    }
    
    public void setMonthNumber(int num){
        monthNumber = num;
        
        if(num < 1 || num > 12)
            monthNumber = 1;
    }
    
    public int getMonthNumber(){
        return monthNumber;
    }
    
    public String getMonthName(){
        String name = "";
        
        switch(monthNumber){
            case 1:
                name = "January";
                break;
            case 2:
                name = "February";
                break;
            case 3:
                name = "March";
                break;
            case 4:
                name = "April";
                break;
            case 5:
                name = "May";
                break;
            case 6:
                name = "June";
                break;
            case 7:
                name = "July";
                break;
            case 8:
                name = "August";
                break;
            case 9:
                name = "September";
                break;
            case 10:
                name = "October";
                break;
            case 11:
                name = "November";
                break;
            case 12:
                name = "December";
                break;    
        }
        
        return name;
    }
    
    public String toString(){
        return getMonthName();
    }
    
    public boolean equals(Month other){
        boolean same = false;
        
        if(getMonthNumber() == other.getMonthNumber())
            same = true;
            
        return same;
    }
    
    public boolean greaterThan(Month other){
        boolean same = false;
        
        if(getMonthNumber() > other.getMonthNumber())
            same = true;
            
        return same;
    }
    
    public boolean lessThan(Month other){
        boolean same = false;
        
        if(getMonthNumber() < other.getMonthNumber())
            same = true;
            
        return same;
    }
}
