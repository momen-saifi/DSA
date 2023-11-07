import java.util.Scanner;

public class MargeSort {
	void marge(int list[],int start,int mid,int end)
	{
		int n1=mid-start+1;
		int n2=end-mid;
		int L[]=new int[n1];
		int R[]=new int[n2];
		for(int i=0;i<n1;i++)
			L[i]=list[start+i];
		for(int j=0;j<n2;j++)
			R[j]=list[mid+j+1];
		int i=0,j=0,k=start;
		while(i<n1 && j<n2)
		{
			if(L[i]<=R[j])
			{
				list[k]=L[i];
				i++;
				k++;
			}
			else
			{
				list[k]=R[j];
				j++;
				k++;
			}
		}
		while(i<n1)
		{
	
			list[k]=L[i];
			i++;
			k++;
		}
		while(j<n2)
		{
	
			list[k]=R[j];
			j++;
			k++;
		}
					
	}
	void margeSortAlgo(int list[],int start,int end)
	{
		if(start<end)
		{
			int mid=(start+end)/2;
			 margeSortAlgo(list,start,mid);
			 margeSortAlgo(list,mid+1,end);
			 marge(list,start,mid,end);
		}
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
		new  MargeSort().margeSortAlgo(list, 0, n-1);
		System.out.println("Array after sorting");
		for(int i=0;i<n;i++)
		{
			System.out.print(list[i]+" ");
		}
		
	}

}


