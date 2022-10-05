import java.util.Scanner;
/**
 *
 * @author student
 */
public class ChargeAccountValidation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter account number:");
        int acctNum = input.nextInt();
        acctSearch(acctNum);
    }
    
    public static void acctSearch(int acctNum){
        boolean test = false;
        int[] array = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850,
                       8080152, 4562555, 5552012, 5050552, 7825877, 1250255,
                       1005231, 6545231, 3852085, 7576651, 7881200, 4581002};
        
        for(int i = 0; i < array.length && test == false; i++){
                if(acctNum == array[i])
                    test = true;
        }
        
        if(test == true)
            System.out.println("Account number is valid");
        else
            System.out.println("Account number is NOT valid");
    }
}
