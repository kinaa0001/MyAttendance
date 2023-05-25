public class Plane extends Vehicle {
	
	String Name = "U-2 Spy Plane";
	String wingspan = "32 m";
	String SpyTireType = "radial ";
	
	
	public void Fly() {
		System.out.println("Driving the plane!");
		
	}
	@Override
	void stop() {
		System.out.println("Stop the vehicle!");
		
	}
	

}
