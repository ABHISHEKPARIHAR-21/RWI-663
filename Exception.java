package RWI;

public class Exception {

	public static void main(String[] args) {
		try {
		 int[] numbers = {1, 2, 3};
         System.out.println("Element 4: " + numbers[3]);  

     } catch (ArrayIndexOutOfBoundsException e) {

         System.out.println("Exception caught: Array index is out of bounds!");
     } finally {

         System.out.println("Finally block is executed.");
     }
     

     System.out.println("Rest of the code...");

	}

}
