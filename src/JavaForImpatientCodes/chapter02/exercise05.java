package JavaForImpatientCodes.chapter02;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Class <code>exercise05</code> is a part of package JavaForImpatientCodes and contains required class for the same question.
 * I decided to use BigDecimal class (and not double) for x and y coordinate just to avoid cases when double types loses its precision.
 * @author mrm500
 */
public class exercise05 {
    public static void main(String[] args){
        point p = new point(3,4).translate(1,3).scale(0.5);
        System.out.println("\nCoordinate set to \nx = " + p.getX() + ", y = " + p.getY());
    }
    static class point{
        private BigDecimal xCoordinate;
        private BigDecimal yCoordinate;

        /**
         * Default constructor for class point. Set the object to origin.
         */
        public point(){
            xCoordinate = BigDecimal.valueOf(0);
            yCoordinate = BigDecimal.valueOf(0);
        }

        /**
         * Sets the object to x, y passed in parameter
         * @param x X-coordinate of the point to set to.
         * @param y Y-coordinate of the point to set to.
         */
        public point(double x, double y){
            xCoordinate = BigDecimal.valueOf(x);
            yCoordinate = BigDecimal.valueOf(y);
        }
        public double getX(){
            return xCoordinate.doubleValue();
        }
        public double getY(){
            return yCoordinate.doubleValue();
        }
        public point translate(double x, double y){
            point temp = new point(xCoordinate.add(BigDecimal.valueOf(x)).doubleValue(),yCoordinate.add(BigDecimal.valueOf(y)).doubleValue());
            return temp;
        }
        public point scale(double s){
            point temp = new point(xCoordinate.multiply(BigDecimal.valueOf(s)).doubleValue(),yCoordinate.multiply(BigDecimal.valueOf(s)).doubleValue());
            return temp;
        }
    }
}
