import java.util.Scanner;
public class LandTractDriver {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please input length of object 1:");
        double length1 = input.nextDouble();
        System.out.print("Please input width of object 1:");
        double width1 = input.nextDouble();
        
        LandTract tract1 = new LandTract(length1, width1);
        
        System.out.print("Please input length of object 2:");
        double length2 = input.nextDouble();
        System.out.print("Please input width of object 2:");
        double width2 = input.nextDouble();
        
        LandTract tract2 = new LandTract(length2, width2);
        
        System.out.println("Tract1= " + tract1);
        System.out.println("Tract2= " + tract2);
        
        if(tract1.equals(tract2))
            System.out.println("They are equal");
        else
            System.out.println("They are NOT equal");
    }
}
