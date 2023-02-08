import java.io.*;
import java.util.*;

class eligible
{
 public static void main(String[] args)
 {
   int age; 
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the age of the person");
   age=sc.nextInt();
   if(age>=18)
   {
     System.out.println("eligible to vote");
   }
   else{
     System.out.println("eligible to vote after"+(18-age));

   }
 }
}
