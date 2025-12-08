package acharya.com;
import java.util.Scanner;
public class SlidebySlide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter the array element:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {     
                count++;
            }
        }
        System.out.println("Total count" + count);
        sc.close();
    }

	}


