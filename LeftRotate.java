
public class LeftRotate {
	public static void main(String []args)
	{
		int arr[]=new int[]{1,2,3,4,5};
		int n=3;
		int temp;
		
		
		System.out.println("Array befour rotate");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}		
		for(int k=0;k<n;k++)
		{
			temp=arr[0];
			for(int i=0;i<arr.length-1;i++)
			{
				arr[i]=arr[i+1];
			}
			arr[arr.length-1]=temp;
		}
		
		System.out.println("Array after rotate");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}		
		
	}
}
