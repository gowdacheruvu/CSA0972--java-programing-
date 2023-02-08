import java.io.*;
import java.util.*;
class fibsum
{  
public static void main(String args[])  
{    
      int n, i, sum;
      Scanner my_scanner = new Scanner(System.in);
      System.out.println("Enter the value of N: ");
      n = my_scanner.nextInt();
      int f[] = new int[2 * n + 1];
      f[0] = 0;
      f[1] = 1;
      sum = 0;
      for (i = 2; i <= n; i++) {
         f[i] = f[i - 1] + f[i - 2];
         if (i % 2 == 0){
            sum += f[i];
         }
      }
      System.out.printf("Even sum of fibonacci series till number %d is %d" , n, sum);
   }
}
