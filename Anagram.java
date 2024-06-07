package RWI;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1="the classroom";
		String str2="school master";
		
		str1=str1.replace(" ","");
		str2=str2.replace(" ","");
		char ar1[]=str1.toCharArray();
		char ar2[]=str2.toCharArray();
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		System.out.println(ar1);
		System.out.println(ar2);
		if(Arrays.equals(ar1, ar2))
		{
			System.out.println("it's an anagram");
		}
		else
			System.out.println("not an anagram");
	}

}
