package acharya.com;
import java.util.Scanner;
public class SumElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the elements");
           int arr [][]= {
        		   {2,3,4},
        		   {1,5,2},
        		   {2,4,5}
        		   
           };
           int sum =0;
           for(int i=0;i <arr.length;i++) {
        	   for(int j=0; j< arr.length;j++) {
        		   sum+=arr[i][j];
        	   }
           }
           System.out.println("sum of all elements ="+sum);
	}

}
