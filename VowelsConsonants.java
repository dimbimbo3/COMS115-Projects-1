public class VowelsConsonants {
    private String input;
    
    public VowelsConsonants(String s){
        input = s;
    }
    
    public String getInput(){
        return input;
    }
    
    public int getVowels(){
        int vowelsCount = 0;
        
        for(int i = 0; i < getInput().length(); i++){
            char temp = getInput().charAt(i);
            switch(temp){
                case 'a':
                case 'A':
                    vowelsCount++;
                    break;
                case 'e':
                case 'E':
                    vowelsCount++;
                    break;
                case 'i':
                case 'I':
                    vowelsCount++;
                    break;
                case 'o':
                case 'O':
                    vowelsCount++;
                    break;
                case 'u':
                case 'U':
                    vowelsCount++;
                    break;
            }
        }
        
        return vowelsCount;
    }
    
    public int getConsonants(){
        int consonantsCount = 0;
        
        StringBuilder s = new StringBuilder(getInput());
        int space = s.indexOf(" ");
        while(space != -1){
            s.deleteCharAt(space);
            space = s.indexOf(" ");
        }
        
        for(int i = 0; i < s.length(); i++){
            char temp = s.charAt(i);
            if(temp != 'a' && temp != 'A' && temp != 'e' && temp != 'E' &&
               temp != 'i' && temp != 'I' && temp != 'o' && temp != 'O' &&
               temp != 'u' && temp != 'U' && !Character.isDigit(temp))
                 consonantsCount++;
        }
        
        return consonantsCount;
    }
}
