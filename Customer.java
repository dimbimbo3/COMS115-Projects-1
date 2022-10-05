public class Customer extends Person{
    private String cNumber;
    private int mList;
    private final int YES = 1;
    private final int NO = 2;
    
    public Customer(){
        super();
        cNumber = "NONE";
        mList = 1;
    }
    
    public Customer(String name, String address, String phone, String customer,
                    int mailing)
    {
        super(name,address,phone);
        cNumber = customer;
        mList = mailing;
    }
    
    public void setCustomer(String customer){
        cNumber = customer;
    }
    
    public void setMailing(int mailing){
        mList = mailing;
    }
    
    public String getCustomer(){
        return cNumber;
    }
    
    public int getMailing(){
        return mList;
    }
    
    public String toString(){
        String s = super.toString();
        s += "\nCustomer Number: " + cNumber;
        s += "\nMailing List: ";
        if(mList == YES)
            s += "Yes";
        else if (mList == NO)
            s += "No";
        else
            s += "INVALID INPUT";
        
        return s;
    }
}
