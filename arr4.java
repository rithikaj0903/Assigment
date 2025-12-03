package acharya.com;

public class arr4 {
	public static int printmultiples(int arr[]) {
		 int count=0;
         for (int i =0;i<arr.length-1; i++) {
        	 if (arr[i]==arr[i+1]) {
        		 count++;
        		 
        	 }
        	 
         }
            return count;
	 
	 
	 
	 
	 
	 
 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,1,2,2,3,4,4,5};
System.out.println(" count   " +printmultiples(arr));
	}

}
