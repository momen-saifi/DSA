package Array;


public class ArrFor {
	public static void main(String args[])
	{
		int i,j=0;
		//int arr[]= {10,20,30,40};
		for(i=0;i<10;i++)
		{
			if(j==5)
			{
				continue;
			}

			for( j=0;j<10;j++)
			{
				System.out.println(i+" "+j);
				

			}
			
			
		}
	}

}

