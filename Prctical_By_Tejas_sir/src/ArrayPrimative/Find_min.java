package ArrayPrimative;

public class Find_min {

	public static void main(String[] args) {
		
		        int[] numbers = {3, 5, 1, 8, 2, 6}; // Sample array
		        
		        // Call the function to find the minimum number
		        int min = findMin(numbers);
		        
		        System.out.println("The minimum number is: " + min);
		    }

		    public static int findMin(int[] array) {
		        int min = array[0]; // Start by assuming the first element is the minimum
		        
		        for (int i = 1; i < array.length; i++) {
		            if (array[i] < min) {
		                min = array[i]; // Update min if a smaller element is found
		            }
		        }
		        
		        return min; // Return the minimum number
		    
		

	}

}
