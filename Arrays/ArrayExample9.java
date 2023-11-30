package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class ArrayExample9 {
	
	public static void removeDuplicate1(int arr[])
	{
		ArrayList<Integer> array=new ArrayList<Integer>();
		int size=arr.length;
		
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=-1;
				}
				
			}
			if(arr[i]!=-1)
				array.add(arr[i]);
		}
		int newArr[]=new int[array.size()];
		
			for(int i=0;i<newArr.length;i++)
			{
				newArr[i]=array.get(i);
			}
			
		System.out.println(Arrays.toString(newArr));
	}
	
	public static void removeDuplicate2(int arr[])
	{
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			set.add(arr[i]);
		}
		System.out.println(set);	
	}
	
	
	public static void main(String args[])
	{
		
		int intArr[]= {10,15,20,15,8,10,25,25,70,86,40};
		//removeDuplicate1(intArr);
		removeDuplicate2(intArr);
		
	}

}
