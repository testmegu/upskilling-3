

class Encapsulate {
	// 
	private String Name;
	private int Roll;
	private int Age;

	
	public int getAge() { return Age; }

	
	public String getName() { return Name; }

	
	public int getRoll() { return Roll; }

	
	public void setAge(int newAge) {Age = newAge; }

	
	public void setName(String newName)
	{
		Name = newName;
	}

	// set method for roll to access
	
	public void setRoll(int newRoll) { Roll = newRoll; }
}

public class TestEncapsulation {
	public static void main(String[] args)
	{
		Encapsulate obj = new Encapsulate();

		// setting values of the variables
		obj.setName("Meghana");
		obj.setAge(24);
		obj.setRoll(78);

		// Displaying values of the variables
		System.out.println(" name: " + obj.getName());
		System.out.println(" age: " + obj.getAge());
		System.out.println("roll: " + obj.getRoll());
	}
		
}
