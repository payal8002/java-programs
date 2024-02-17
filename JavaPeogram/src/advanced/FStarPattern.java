package advanced;

public class FStarPattern {

	public static void main(String[] args) {
		        int size = 5; // Specify the size of the pattern

		        // Outer loop for rows
		        for (int i = 0; i < size; i++) {
		            // Inner loop for columns
		            for (int j = 0; j < size; j++) {
		                if (i == 0 || i == size / 2 || (j == 0 && i <= size / 2) || (j == size - 1 && i <= size / 2)) {
		                    System.out.print("*");
		                } else {
		                    System.out.print(" ");
		                }
		            }
		            System.out.println();
		        }
		    }
		

	}


