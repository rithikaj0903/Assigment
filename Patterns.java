package acharya.com;
import java.util.Scanner;
public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner (System.in);
          System.out.println("enter a number");
          int n =sc.nextInt();
          sc.close();
          for(int i=n;i>0;i--) {
        	  for(int j =0;j<i;j++) {
        		  System.out.print("*");
        	  }
        	  System.out.println();
          }
	}

}
