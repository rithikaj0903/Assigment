package acharya.com;

import java.util.Scanner;

public class TwoDimArrya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[3][4];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println("enter the value for row"+(i+1)+"and column"+(j+1));
				arr[i][j]=sc.nextInt();

			}

		}
		for(int i=0;i<arr.length;i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}
	}

}