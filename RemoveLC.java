package RWI;

public class RemoveLC {
    public static void main(String[] args) {
        String str = "Abhishek Singh Parihar";
       str=str.replaceAll("[a-z]","");
        System.out.println("String after removing lowercase letters: " + str);
    }
}