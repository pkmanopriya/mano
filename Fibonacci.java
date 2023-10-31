import java.util.s
public class Fibonacci{
   public static void main(String []args);
   scanner input=new scanner (System.in);
    System.out.printIn("Enter the number");
    int c=input.nextInt();
    int a=0;
    int b=1;
    for(int d=1;d<=100;d++){
      d=a+b;
      a=b;
      b=d; 

     System.out.printIn(d);
    }
}
}
