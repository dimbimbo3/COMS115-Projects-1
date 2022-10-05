import java.util.Scanner;

public class ProductionDriver {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name = "";
        String number = "";
        String date = "";
        int shift = 0;
        double rate = 0;
        
        System.out.print("Please input Employee Name:");
        name = input.nextLine();
        
        System.out.println("Please input Employee Number(Format: XXX-L)");
        System.out.print("Each X must be between 0-9"
                          + " and L within the range A-M:");
        number = input.nextLine();
        
        System.out.print("Please input Hire Date:");
        date = input.nextLine();
        
        System.out.print("Please input Shift(Type '1' for Day"
                + " or '2' for Night):");
        shift = input.nextInt();
        
        System.out.print("Please input Hourly Pay Rate:");
        rate = input.nextDouble();
        
        ProductionWorker worker = new ProductionWorker(name,number,date,
                                                       shift,rate);
        
        System.out.println(worker);
        
        
    }
}