import java.io.*;
import java.util.*;

class pattern3 
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of rows");
    int row=sc.nextInt();
    for(int i=1;i<=row;i++){
      for(int j=1;j<=i;j++){
        System.out.print(i);
      }
     System.out.println();
    }
  }
}
