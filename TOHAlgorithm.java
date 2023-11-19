
public class TOHAlgorithm {
	
	void TOH(int n,char start,char aux,char end) {
		
		if(n>0)
		{
			TOH(n-1,start,end,aux);
			System.out.println("Move "+n+"th Disk form "+start+" to "+end);
			TOH(n-1,aux,start,end);
		}
		
	}
	
	public static void main(String args[])
	{
		TOHAlgorithm t1=new TOHAlgorithm();
		
		t1.TOH(3, 'A', 'B', 'C');
	}
	

}
