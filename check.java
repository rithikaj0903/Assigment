package acharya.com;

public class check {
 public static int printmultiples(int arr[]) {
    int count=0;
         for (int i =0;i<arr.length; i++) {
        	 if (arr[i]%3==0) {
        		 count++;
        		 
        	 }
        	 
         }
            return count;
	 
	 
	 
	 
	 
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
         
         int arr[]= {1,2,3,4,9};
         System.out.println(" count of multi of 3  " +printmultiples(arr));
         
         
         
	}

}
