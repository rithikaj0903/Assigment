package acharya.com;
import java.util.Scanner;
public class ArrayaUsingLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter given arrya length:");
  int length = sc.nextInt();
   int[]arr=new int[length];
   System.out.println("Enter array elements:");
   for  (int i=0; i<length;i++) {
	   arr[i]=sc.nextInt();
   }
   System.out.println("Arrya elements is :");
   boolean value = ArrayaUsingLoop.pro(arr);
   if(value) {
	   System.out.println("true");
   } else {
	   System.out.println("false");
   }
   
		  
	}
	public static boolean pro(int[] arr) {
		for(int j=0;j<arr.length;j++) {
			if(arr[j]==1 && arr[j+1]== 2 && arr[j+2]==3) {
				return true;
			}
		}
		return false;
	}

}
