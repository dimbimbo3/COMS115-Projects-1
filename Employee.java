public class Employee {
    private String empName;
    private String empNumber;
    private String hireDate;
    
    public Employee(){
        empName = "NONE";
        empNumber = "NONE";
        hireDate = "NONE";
    }
    
    public Employee(String name, String number, String date){
        empName = name;
        empNumber = number;
        hireDate = date;
    }
    
    public void setName(String s){
        empName = s;
    }
    
    public void setNumber(String s){
        empNumber = s;
    }
    
    public void setDate(String s){
        hireDate = s;
    }
    
    public String getName(){
        return empName;
    }
    
    public String getNumber(){
        if(!isValid())
            empNumber = "INVALID EMPLOYEE NUMBER";
        return empNumber;
    }
    
    public String getDate(){
        return hireDate;
    }
    
    private boolean isValid(){
        boolean valid = true;
        final int numLength = 5;
        
        if(empNumber.length() != numLength)
            valid = false;
        else{
            if(!Character.isDigit(empNumber.charAt(0))
               || !Character.isDigit(empNumber.charAt(1))
               || !Character.isDigit(empNumber.charAt(2))
               || empNumber.charAt(3) != '-'
               || !Character.isLetter(empNumber.charAt(4))
               || !(empNumber.charAt(4) >= 'A' && empNumber.charAt(4) <= 'M'))
                valid = false;
        }
        
        return valid;
    }
    
    public String toString(){
        String s = "\nEmployee Name: " + empName;
        s += "\nEmployee Number: " + getNumber();
        s += "\nHire Date: " + hireDate;
        
        return s;
    }
}
