import java.util.*;
class Shape{
    public void printColor(String s){
    System.out.printIn("Color Of "+s+"Is Blue");
    }
}
class Triangle extends Shape{
    public void area(double base,double height){
        System.out.printIn(0.5*base*height);
     }
  }
publi class SingleInheritance
{
    public static void main(String[]args){
        scanner sc=new Scanner(System.in);
        Triangle t=new Triangle();
        String s=sc.next();
        double base=sc.nextDouble();
        t.printColor(s);
        t.area(base,height);
   }
}
