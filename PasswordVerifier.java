public class PasswordVerifier {
    private String password;
    
    public PasswordVerifier(String s){
        password = s;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String s){
        password = s;
    }
    
    private boolean lengthTest(){
        boolean validLength = false;
        
        if(password.length() >= 6)
            validLength = true;
        
        return validLength;
    }
    
    private boolean numTest(){
        boolean validNum = false;
        
        for(int i = 0; i < password.length() && !validNum; i++){
           char p = password.charAt(i);
           if(Character.isDigit(p))
               validNum = true;
        }
        
        return validNum;
    }
    
    private boolean upperTest(){
        boolean validUpper = false;
        
        for(int i = 0; i < password.length() && !validUpper; i++){
           char p = password.charAt(i);
           if(Character.isUpperCase(p))
               validUpper = true;
        }
        
        return validUpper;
    }
    
    private boolean lowerTest(){
        boolean validLower = false;
        
        for(int i = 0; i < password.length() && !validLower; i++){
           char p = password.charAt(i);
           if(Character.isLowerCase(p))
               validLower = true;
        }
        
        return validLower;
    }
    
    public void test(){
        if(lengthTest() && numTest() && upperTest() && lowerTest())
            System.out.println("Password is valid");
        else{
            System.out.println("Password is NOT valid");
            if(!lengthTest())
                System.out.println("Your password needs to be at least six characters long");
            if(!numTest())
                System.out.println("Your password needs to have at least one digit");
            if(!upperTest())
                System.out.println("Your password needs to contain at least one uppercase letter");
            if(!lowerTest())
                System.out.println("Your password needs to contain at least one lowercase letter");
        }
            
    }
}
