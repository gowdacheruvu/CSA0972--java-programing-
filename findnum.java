import java.io.*;
import java.util.*;

class findnum
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the starting range");
    int a = input.nextInt();
    System.out.println("Enter the ending range");
    int b = input.nextInt();
    if((a>0)&&(b>0))
    {
    int n = b - a;
    int arr[][] = new int[n][2];
    int k = 0;
    for(int i = a;i<b;i++)
    {
     arr[k][0] = i;
     k+=1;
    }
    
    for(int i = 0;i<n;i++)
    {
     arr[i][1] = arr[i][0] * arr[i][0];
     }
    System.out.println("The number along with the squares are:");
    for(int i=0;i<n;i++)
    {
     for(int j = 0;j<2;j++)
      {
        System.out.println(arr[i][j]);
       }
    }
   }
   else
   {
    System.out.println("Enter the correct number");
   }
  }
}
