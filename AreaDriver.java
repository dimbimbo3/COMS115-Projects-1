public class AreaDriver {
    public static void main (String[] args){
        double circle = Area.getArea(10);
        int rectangle = Area.getArea(10, 5);
        double cylinder = Area.getArea(10.0, 5.0);
        
        System.out.println("Circle Area = " + circle);
        System.out.println("Rectangle Area = " + rectangle);
        System.out.println("Cylinder Area = " + cylinder);
    }
}
