import  java.util.Scanner;
public class activitr {
     public  static  void  main (String [] args ){
         Scanner brt  =new Scanner(System.in);

         System.out.print("hava sıcaklık değerini giriniz =");
         int a =brt.nextInt();

         if (a<5 )
             System.out.print("kayak yapilabilir ");
         else if ((a<15) &&(a>5))
             System.out.print("sinemay gidilebilir ");
         else  if ((a>15) &&(a<20 ) )
              System.out.print( " piknik yapılabilir ");
         else  if ((a<25 ) &&(a>20 ))
             System.out.print( " yüzme yapılabilir ");
     }
}
