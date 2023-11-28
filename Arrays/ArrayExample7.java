package Array;


import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;
public class ArrayExample7 {
	
	ArrayExample7()
	{
		int matrix [][]=new int[3][3];
		
		Vector<Integer> v=new Vector<Integer>(); 
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Sort 2D array across Rows");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				v.add(matrix[i][j]);
			}
			Collections.sort(v);
				
		for(int j=0;j<3;j++)
		{
			matrix[i][j]=v.get(j);
		}
		v.removeAll(v);					
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public static void main(String args[])
	{
		ArrayExample7 m1=new ArrayExample7();
		
		
	}

}
