package RWI;

public class Palindrome {

	public static void main(String[] args) {
		String str="abhishek";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
{
	rev=rev+str.charAt(i);
}
		if(str.equals(rev))
		{
			System.out.println("it's a palindrome");
		}
		else
			System.out.println("not a palindrome");
	}

}
