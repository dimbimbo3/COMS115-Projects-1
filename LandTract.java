public class LandTract {
    private double length;
    private double width;
    
    public LandTract(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    public double getArea(){
        return length * width;
    }
    
    public String toString(){
        String s;
        s = "Length=" + length + " Width=" + width;
        s += " Area=" + getArea();
        return s;
    }
    
    public boolean equals(LandTract other){
        boolean same = false;
        
        if(getArea() == other.getArea())
            same = true;
            
        return same;
    }
}