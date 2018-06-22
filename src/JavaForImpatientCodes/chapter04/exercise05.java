package JavaForImpatientCodes.chapter04;
import java.lang.Exception;

public class exercise05 {
    public static void main(String[] args){
        Circle c = new Circle(new Point(3,3),2.5);
        System.out.println(c.getLocation().toString());
        Circle clonedC = null;
        try {
            clonedC = c.clone();
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println(clonedC.getLocation().toString());
        c.moveBy(1,1);
        System.out.println(c.getLocation().toString());
        System.out.println(clonedC.getLocation().toString());
    }
}

abstract class Shape{
    private Point location;

    public Shape(Point location){
        this.location = new Point(location.getX(),location.getY());
    }
    public Point getLocation() {
        return location;
    }
    public void moveBy(double dx, double dy){
        this.location = new Point(this.location.getX() + dx, this.location.getY() + dy);
    }
}

class Circle extends Shape{
    private double radius;

    public Circle(Point centre, double radius){
        super(centre);
        this.radius = radius;
    }

    @Override
    public Circle clone() throws CloneNotSupportedException {
        Circle cloned = new Circle(this.getLocation(), radius);
        return cloned;
    }
}
