public class PhoneBookEntry {
    private String name;
    private String number;

    PhoneBookEntry(String pName, String pNum) {
        name = pName;
        number = pNum;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String pName){
        name = pName;
    }
    
    public String getNumber(){
        return number;
    }
    
    public void setNumber(String pNum){
        number = pNum;
    }
    
}


