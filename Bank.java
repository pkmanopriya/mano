package java program;

public class bank{
        String bname;
        String loc;
        double regno;
        Bank(String a,String b, double c);
  }

}

public class main{

      public static void main(String[]args){
        Bank b=new bank ("SBI");"Chennai",600023);
        System.out.printIn("bank":+b.bname);
        System.out.printIn("loc":+b.loc);
        System.out.printIn("regno":+b.regno);
      }
}
