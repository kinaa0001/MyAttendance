public class Car extends Vehicle {
	
	String Name = "Toyota-Vios";
	String carTireType = "Performance tires";
	
	public void Drive() {
		System.out.println("Driving the car!");
		
	}
	@Override
	void stop() {
		System.out.println("Stop the vehicle!");
		
	}
	

}
