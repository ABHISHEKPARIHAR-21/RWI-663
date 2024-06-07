package RWI;

public class countLCUC {

	public static void main(String[] args) {
		 String str = "Abhishek Singh Parihar";
	        

	        int LC = 0;
	        int UC = 0;
	        
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            

	            if (ch >= 'a' && ch <= 'z') {
	                LC++;
	            }
	            

	            else if (ch >= 'A' && ch <= 'Z') {
	                UC++;
	            }
	        }
	        

	        System.out.println("Number of lowercase letters: " + LC);
	        System.out.println("Number of uppercase letters: " + UC);

	}

}
