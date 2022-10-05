import java.util.Scanner;

public class CustomerDriver {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name = "";
        String address = "";
        String phone = "";
        String customer = "";
        int mailing = 0;
        double amount = 0.0;
        
        System.out.print("Please input your name:");
        name = input.nextLine();
        
        System.out.print("Please input your address:");
        address = input.nextLine();
        
        System.out.print("Please input your phone number:");
        phone = input.nextLine();
        
        System.out.print("Please input your customer number:");
        customer = input.nextLine();
        
        System.out.println("Would you like to be on the mailing list?");
        System.out.print("Type '1' for Yes or '2' for No:");
        mailing = input.nextInt();
        
        System.out.print("Please input your Purchase Amount:");
        amount = input.nextDouble();
        
        PreferredCustomer cust1 = new PreferredCustomer(name,address,phone,
                                                       customer,mailing,amount);
        System.out.println(cust1);
    }
}
