import java.io.*;
import java.util.*;

class hollowdollar 
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of rows");
    int row=sc.nextInt();
    System.out.println("enter the number of columns");
    int col=sc.nextInt();
    for (int i = 1; i <=row; i++) {
			for (int j = 1; j <= col; j++) {
				if((i==1 || i==col) || (j==1 || j==col)){
					System.out.print("$");}
				else{
					System.out.print(" ");}}
			
			System.out.println();
			
		     }
    
  }
}
