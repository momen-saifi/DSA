package Array;

public class ArrayLargest {
	public static void main(String []args)
	{
		int arr[]=new int[]{1,2,8,3,2,2,2,2,5,1};
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{

			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		
		
		System.out.println(max);

	}


}
