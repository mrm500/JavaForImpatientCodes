package JavaForImpatientCodes.chapter04;

import java.util.Objects;

public class exercise03 {
    public static void main(String[] args){
        LabeledPoint lp = new LabeledPoint("m83",45.69, 13.52);
        System.out.println(lp.toString());
        LabeledPoint newlp = new LabeledPoint("m83", 45.69, 13.52);
        System.out.println("lp.equals(newlp) -> " + lp.equals(newlp));
        System.out.println("hashcode of newlp = " + newlp.hashCode() + ", lp = " + lp.hashCode());
    }
}

class Point{

    protected double x;
    protected double y;

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[x=" + x + ", y=" + y + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || getClass() != obj.getClass())
            return false;
        if (this == obj)
            return true;
        Point temp = (Point) obj;
        return Double.compare(this.getX(),temp.getX()) == 0 && Double.compare(this.getY(),temp.getY()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x,y);
    }
}

class LabeledPoint extends Point{
    private String label;

    public String getLabel() {
        return label;
    }
    public LabeledPoint(String label, double x, double y){
        super(x,y);
        this.label = label;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[x=" + x + ", y=" + y + ", label=" + label + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass())
            return false;
        if (this == obj)
            return true;
        LabeledPoint temp = (LabeledPoint) obj;
        return this.label.compareTo(temp.getLabel()) == 0 && Double.compare(this.getX(),temp.getX()) == 0 && Double.compare(this.getY(),temp.getY()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(label,super.hashCode());
    }
}



