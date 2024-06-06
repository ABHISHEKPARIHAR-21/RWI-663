package RWI;

public class Arrays {

	public static void main(String[]args)
	{
		int arr1[]= {2,4,2};
		int arr2[]= {1,2,3};
		int res[]=new int[3];
		for(int i=0;i<arr1.length;i++)
		{
			res[i]=arr1[i]+arr2[i];
		}
		System.out.println(res[0]);
		System.out.println(res[1]);
		System.out.println(res[2]);
	}


	}

	

