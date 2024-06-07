package RWI;

public class Occurance {

	public static void main(String[] args) {
		String str="abhishek";
		char ch='h';
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.println(count);
     
		
	}

}
