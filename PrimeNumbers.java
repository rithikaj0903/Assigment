package acharya.com;
import java.util.Scanner;
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner (System.in);
          System.out.println("enter a number");
          int num=sc.nextInt();
          boolean isPrime=true;
          for(int i=2;i<Math.sqrt(num);i++) {
        	  if(num%i==0) {
        		  isPrime=false;
        		  break;
        	  }
          }
        	  System.out.println(" the given number is prime :"+isPrime);
          }
	}


