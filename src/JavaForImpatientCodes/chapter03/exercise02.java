package JavaForImpatientCodes.chapter03;

import java.math.BigDecimal;
import java.util.Scanner;

public class exercise02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of objects to put into array : ");
        int numberOfObjects;
        numberOfObjects = (int) sc.nextDouble();
        sc.nextLine();
        System.out.println("Count : " + numberOfObjects);
        Employee[] employees=new Employee[numberOfObjects];
        System.out.println("Enter name, salary, class in the same order.");
        String n; double sal, c;
        for(int i=0; i< numberOfObjects; i++){
            System.out.println("In Loop");
            n = sc.nextLine();
            sal = sc.nextDouble();
            c = sc.nextDouble();
            employees[i] = new Employee(n, sal, c);
        }
        System.out.println("Average salary of object employee[] is : " + Employee.average(employees));
        Measureable m = Employee.largest(employees);
        System.out.println("Name of employee with highest salary : " + ((Employee)m).getname());
    }
}
interface Measureable{
    public double getMeasure();
}
class Employee implements Measureable{
    private String _name;
    private double _salary;
    private double _category;
    public Employee(String n, double sal, double c){
        this._name = n;
        this._salary = sal;
        this._category = c;
    }
    double getCategory(){
        return _category;
    }
    double getSalary(){
        return _salary;
    }
    String  getname(){
        return _name;
    }

    @Override
    public double getMeasure() {
        return this._category;
    }
    static double average(Measureable[] objects){
        if(objects instanceof Employee[]){
            Employee[] employees = (Employee[]) objects;
            BigDecimal sum = BigDecimal.ZERO;
            for(int i=0; i<employees.length; i++){
                sum = sum.add(BigDecimal.valueOf(employees[i].getSalary()));
            }
            return sum.divide(BigDecimal.valueOf(employees.length),2,BigDecimal.ROUND_HALF_UP).doubleValue();
        }
        else
            return 0;
    }
    static Measureable largest(Measureable[] objects){
        Employee maxEmployee = new Employee("",0,0);
        if(objects instanceof Employee[]){
            Employee[] obj = (Employee[]) objects;
            double maxSalary = 0;
            for(Employee e: obj){
                if(maxSalary < e.getSalary()){
                    maxEmployee = e;
                    maxSalary = e.getSalary();
                }
            }
        }
        return (Measureable) maxEmployee;
    }
}