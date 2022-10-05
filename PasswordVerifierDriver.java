import java.util.Scanner;
public class PasswordVerifierDriver {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter your password:");
        String user = input.nextLine();
        PasswordVerifier password = new PasswordVerifier(user);
        
        password.test();
    }
}
