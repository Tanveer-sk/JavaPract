package OOPS.Objects;

public class ObjectInitializTechs {

	 String color;
	 int weight;
	
	
	public static void main(String[] args) {
		
		//Object Init using reference variables
		
		ObjectInitializTechs obj = new ObjectInitializTechs();
		obj.color="Red";
		obj.weight=32;
		System.out.println("Prining by ref. variables "+obj.color+" "+obj.weight);
		
		obj.color="black";
		obj.weight=34;
		System.out.println(obj.color+" "+obj.weight);
		

			obj.inintvalues("Yellow", 99);
			obj.dispvalues();
			//System.out.println(color+" "+weight);
			ObjectInitializTechs obj1 = new ObjectInitializTechs();
			System.out.println(obj1.color);
			
			
		
	}

	public void inintvalues(String c,int w)
	{
		color=c;
		weight=w;
	}
	
	public void dispvalues()
	{
		System.out.println("Values initilalized using methods "+color+" "+weight);
	}
}
