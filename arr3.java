package acharya.com;

public class arr3 {
 public static int printmultiples(int arr[]) {
    int count=0;
         for (int i =0;i<arr.length; i++) {
        	 if (arr[i]%5==0) {
        		 count++;
        		 
        	 }
        	 
         }
            return count;
	 
	 
	 
	 
	 
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
         
         int arr[]= {5,10,1,4,15};
         System.out.println(" count of multi of 5  " +printmultiples(arr));
         
         
         
	}

}
