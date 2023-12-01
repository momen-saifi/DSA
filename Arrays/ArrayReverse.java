package Array;

public class ArrayReverse {
	public static void main(String []args)
	{
		int arr[]=new int[]{1,2,3,4,5};
		int temp;
		int l=arr.length;
		for(int i=0;i<l/2;i++)
		{
			temp=arr[i];
			arr[i]=arr[l-i-1];
			arr[l-i-1]=temp;
		}
		for(int i=0;i<l;i++)
		{
			System.out.print(arr[i]+"  ");			
		}

	}


}