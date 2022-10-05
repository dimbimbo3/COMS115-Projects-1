public class Person {
    private String name;
    private String address;
    private String phone;
    
    public Person(){
        name = "NONE";
        address = "NONE";
        phone = "NONE";
    }
    
    public Person(String name, String address, String phone){
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public void setAddress(String a){
        address = a;
    }
    
    public void setPhone(String p){
        phone = p;
    }
    
    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public String toString(){
        String s = "\nName: " + name;
        s += "\nAddress: " + address;
        s += "\nPhone Number: " + phone;
        
        return s;
    }
}
