import java.util.Scanner;

public class LCS {
	
	int lcs(String X,String Y,int m,int n,int L[][])
	{
		for(int i=0;i<=m;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==0 || j==0)
					L[i][j]=0;
				else if(X.charAt(i-1)==Y.charAt(j-1))
					L[i][j]=L[i-1][j-1]+1;
				else
					L[i][j]=max(L[i-1][j],L[i][j-1]);
			}
		}
		return L[m][n];
	}
	public void printLcs(String X,String Y,int m,int n,int L[][]) {
		int index=L[m][n];
		int temp=index;
		char ch[]=new char[index+1];
		ch[index]='\u0000';//set the termination character
		
		int i=m;
		int j=n;
		
		while(i>0 && j>0)
		{
			if(X.charAt(i-1)==Y.charAt(j-1)) {
				ch[index-1]=X.charAt(i-1);
				i--;
				j--;
				index--;
			}
			else if(L[i-1][j]>L[i][j-1])
				i--;
			else
				j--;
				
			
		}
		System.out.println("LCS of "+X+" and "+Y+" is");
		for(int k=0;k<=temp;k++)
			System.out.print(ch[k]+" ");
		
	}
	
	int max(int a,int b)
	{
		return (a>b)?a:b;
	}
	
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first String");
	String X=sc.nextLine();

	System.out.println("Enter the second String");
	String Y=sc.nextLine();
	int m=X.length();
	int n=Y.length();
	int L[][]=new int[m+1][n+1];
	LCS l1=new LCS();
	System.out.println("Longest Common Subsequence is "+l1.lcs(X, Y, m, n,L));
	l1.printLcs(X, Y, m, n, L);
	
	
}

}
