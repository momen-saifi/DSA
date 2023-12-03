package Array;

import java.util.*;
public class MatrixSorting {
	
	MatrixSorting()
	{
		int matrix [][]=new int[3][3];
		
		Vector<Integer> v=new Vector<Integer>(); 
		
		Scanner sc=new Scanner(System.in);
		
		
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
				v.add(matrix[j][i]);
			}
			Collections.sort(v);
			for(int j=0;j<3;j++)
			{
				matrix[j][i]=v.get(j);
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
		MatrixSorting m1=new MatrixSorting();
		
		
	}

}
