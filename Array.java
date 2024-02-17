class Array{
	 public static void main(String[] args) {      
          
        //Initialize array   
        int [] arr = new int [] { 1, 2, 8, 7, 15, 19, 4};   
        int sum = 0;  
          
        //Loop through the array to calculate sum of elements  
        for (int i = 0; i < arr.length; i++) {   
           sum = sum + arr[i];  
        }    
        System.out.println("Sum of all the elements of an array: " + sum);  
    }  

}