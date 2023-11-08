import java.util.Scanner;

public class MatrixChainMultilication {
	
	int[][] matrix_chain_multiplication(int P[])
	{
		int n=P.length;
		int m[][]=new int[n][n];
		int s[][]=new int[n][n];
		int j,q,min;
		
		for(int l=1;l<n-1;l++)
		{
			for(int i=1;i<n-l;i++)
			{
				j=i+l;
				min=Integer.MAX_VALUE;
				for(int k=i;k<j;k++)
				{
					q=m[i][k]+m[k+1][j]+P[i-1]*P[k]*P[j];
					if(min>q)
					{
						min=q;
						s[i][j]=k;
					}
						
				}
				m[i][j]=min;
			}
		}
		return s;
	}
	
	void print_optimal_parens(int s[][],int i,int j)
	{
		if(i==j)
			System.out.print("A"+i);
		else
		{
			System.out.print("(");
			print_optimal_parens(s,i,s[i][j]);
			print_optimal_parens(s,s[i][j]+1,j);
			System.out.print(")");
			
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of matrix");
		int n=sc.nextInt();
		int P[]=new int[n+1];
		System.out.println("Enter 1 matrix row and column");
		P[0]=sc.nextInt();
		P[1]=sc.nextInt();
		
		
		for(int i=2;i<n;i++)
		{
			System.out.println("Enter "+i+" matrix row and column");
			sc.nextInt();
			P[i]=sc.nextInt();
		}
		System.out.println("Enter "+n+" matrix row and column");
		sc.nextInt();
		P[n]=sc.nextInt();
		
		MatrixChainMultilication m1=new MatrixChainMultilication();
		int s[][]=m1.matrix_chain_multiplication(P);
		m1.print_optimal_parens(s, 1, n);
		
				

	}

}
