
public class Car {
	float price;
	String fuel_type;
	String engine;
	String colour;
	float capacity;
	void setPrice(float p)
	{
		price=p;
	}
	void setFuleType(String f)
	{
		fuel_type=f;
	}
	void setEngine(String e)
	{
		engine=e;
	}
	void setColour(String c)
	{
		colour=c;
	}
	void setCapacity(float cp)
	{
		capacity=cp;
	}
	
	void getPrice()
	{
		System.out.println("Car price is :"+price);
	}
	void getFuleType()
	{	
		System.out.println("Car Fuel type  is :"+fuel_type);
	}
	void getEngine()
	{
		System.out.println("Car Engine is :"+engine);
	}
	void setColour()
	{
		System.out.println("Car Colour is :"+colour);
	}
	void setCapacity()
	{
		System.out.println("Car Capacity is :"+capacity);
	}
	
	

}


