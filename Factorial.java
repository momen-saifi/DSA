
public class Factorial {
	int Fact(int n)
	{
		if(n==1)
			return 1;
		return n*Fact(n-1);
	}
	
	public static void main(String args[])
	{
		Factorial f1=new Factorial();
		f1.Fact(n);
	}

}
