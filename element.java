package acharya.com;
import java.util.Scanner;
public class element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the array elements to search ");
       int arr[]= {10,20,30,40,50,60,70,80,90};
       arr=new int[10];
       boolean found=false;
       for(int i=0;i<arr.length; i++) {
    	   arr[i] = sc.nextInt();
    	   found=true;
    	   break;
       }
        if(found)
        	System.out.println(" is found");
        else
        	System.out.println("is not found");
	}
}
       
