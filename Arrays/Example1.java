package basic;


public class Example1 {
	public static void main(String args[])
	{
		Student1 s1=new Student1();
		s1.setRollno(001);
		s1.setName("Momen");
		s1.setAge(22);
		System.out.println("Roll no is :"+s1.getRollno());
		System.out.println("Name is :"+s1.getName());
		System.out.println("Age is :"+s1.getAge());
	}

}
