public class Area {
    public static double getArea (double radius){
        return Math.PI * radius * radius;
    }
    
    public static int getArea (int length, int width){
        return length * width;
    }
    
    public static double getArea (double radius, double height){
        return Math.PI * radius * radius * height;
    }
}