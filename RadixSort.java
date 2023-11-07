import java.util.Scanner;

public class RadixSort {

	private void countingSort(int list[],int exp,int n)
	{
		int output[]=new int[n];
		int count[]=new int [10];
		for(int i=0;i<n;i++)
			count[(list[i]/exp)%10]++;
		for(int i=1;i<10;i++)
			count[i]=count[i]+count[i-1];
		for(int i=0;i<n;i++)
		{
			output[count[(list[i]/exp)%10]-1]=list[i];
			count[(list[i]/exp)%10]--;
		}
		for(int i=0;i<n;i++)
		{
			list[i]=output[i];
		}
		
	}
	
	 RadixSort(int list[],int n)
	 {
		 int max=getMax(list,n);
		 
		 for(int exp=1;max/exp>0;exp *=10)
		 {
			 countingSort(list,exp,n);
		 }
	 }
	 int getMax(int list[],int n)
		{
			int max=list[0];
			for(int i=0;i<n;i++)
			{
				if(max<list[i])
					max=list[i];
			}	
			return max;
		}
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements");
	int n=sc.nextInt();
	int list[]=new int[n];
	System.out.println("Enter array elements");
	for(int i=0;i<n;i++)
	{
		list[i]=sc.nextInt();
	}
	System.out.println("Array befour sorting");
	for(int i=0;i<n;i++)
	{
		System.out.print(list[i]+" ");
	}
	System.out.println();
	new RadixSort(list,n);
	System.out.println("Array after sorting");
	for(int i=0;i<n;i++)
	{
		System.out.print(list[i]+" ");
	}
	
}

}
