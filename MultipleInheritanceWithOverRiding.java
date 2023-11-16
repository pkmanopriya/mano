import java.util.*;
class Shape{
     public void printColor(String s){
         System.out.printIn("Color Of "+s"Is Blue");
    }
    public void area(String s){
         System.out.printIn("AreaOf"+s+": "};
    }
}
class Triangle extends Shape{
     public void area(double base,double height,){
          System.out.printIn((double)1/2*base*height);
     }
}
class Circle extends Triangle{
     public void area(int r){
          System.out.printIn((double)22/7*r*r);
      }
}
public class MultilevelInheritanceWithOverLoading
{
     public static  void main  9String[] args) {
        Scanner sc=new Scanner(System.in);
        Circle c=new Circle();
        String s=sc.next();
        s=s.toLowerCase();
        switch(s){
           case "triangle":
             double base=sc.nextDouble();
             double height=sc.nextDouble();
              c.printColor(s);
              c.area(s);
              c.area(base,height);
              break;
          case "circle";
              int radius=sc.nextInt();
              c.printColor(s);
              c.area(s);
              c.area(radius);
              break;
           dafault:
               System.out.printIn("This program can calculate only of Triangle And Circle");
               break;
        }
}
