class Shape{
    private double area;
    public double getArea()
    {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
class Circle extends Shape{
    private final double radius;
    public Circle(double radius)
    {
        this.radius=radius;
        super.setArea(Math.PI*radius*radius);
    }

    public double getRadius() {
        return radius;
    }
}

class Cylinder extends Circle{
    public Cylinder(double radius,double height){
        super(radius);
        this.height=height;
    }
    private final double height;
    public double getVolume(){
        return super.getArea()*height;
    }
    public double getSurface(){
        return (2*super.getArea()+2*Math.PI*getRadius()*height);
    }
}

public class Stool{
    public Stool(Cylinder...component){
        this.component=component;
    }
    private final Cylinder[] component;
    public double getSurface(){
        double surface=0;
        for(Cylinder cylinder:component){
            surface+=cylinder.getSurface();
        }
        return surface;
    }
    public double getVolume(){
        double volume=0;
        for (Cylinder cylinder : component) {
            volume += cylinder.getVolume();
        }
        return volume;
    }
}

class testStool{
    public static void main(String[] args) {
        Cylinder a=new Cylinder(3.0,1);
        Cylinder b=new Cylinder(1.5,5);
        Cylinder c=new Cylinder(4.0,1);
        Stool stool=new Stool(a,b,c);
        System.out.println("Area is "+stool.getSurface());
        System.out.println("Vol is "+stool.getVolume());
    }
}