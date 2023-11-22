import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class BucketSort {
	
	BucketSort(float array[],int n)
	{
		ArrayList<Float> Bucket[]=new ArrayList[n];
		
		for(int i=0;i<n;i++)
		{
			Bucket[i]=new ArrayList<Float>();
		}
		
		for(int i=0;i<n;i++)
		{
			int bucketIndex=(int)array[i]*n;
			Bucket[bucketIndex].add(array[i]);
		}
		
		for(int i=0;i<n;i++)
		{
			Collections.sort(Bucket[i]);
			/*for(int j=1;j<Bucket[i].size();j++)
			{
				float key=Bucket[i].get(j);
				int k=j-1;
				while(k>=0 && Bucket[i].get(k)>key)
				{
					Bucket[i].add(k+1,Bucket[i].get(k));
					k--;
				}
				Bucket[i].add(k+1,key);
			}*/
		}
		int index=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<Bucket[i].size();j++)
			{
				array[index++]=Bucket[i].get(j);
			}
		}
	}
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		float list[]=new float[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
		{
			list[i]=sc.nextFloat();
		}
		System.out.println("Array befour sorting");
		for(int i=0;i<n;i++)
		{
			System.out.print(list[i]+" ");
		}
		System.out.println();
		new BucketSort(list,n-1);
		System.out.println("Array after sorting");
		for(int i=0;i<n;i++)
		{
			System.out.print(list[i]+" ");
		}
		
	}

}




