import java.util.*;
class Rbi {
       public void interest(int p,int n,int r){
     System.out.printIn((double)p*n*r/100.0);
     }
}

class Hdfc extends Rbi {
      public void hdfcInterest(String s) {
         System.out.printIn(s+"Interest: ");
    }
}

class Sbi extends Rbi {
       public void sbiInterest(String s) {
         System.out.printIn(s+" Interest: ");
      }
}

public void HierachicalInheritance{
      public static void main(String[] args) {
         Scannewr sc=new Scanner(System.in);
         int principal=sc.nextInt();
         int noofyears=sc.nextInt();
         int rateofinterest=sc.nextInt();
    Sbi s1=new Sbi();
    s1.sbiInterest("SBI");
    s1.interest(principal,noofyears,rateofinterest);
    Hdfc h1=new Hdfc();
    h1.hdfcInterest("HDFC");
    h1.interest(principal,noofyears,rateofinterest+);
     }
}
   
