public class Boat extends Vehicle {
	
	String Name = "Fandango Yacht";
	String MainSailColor = "White";
	
	
	public void Float() {
		System.out.println("Driving the Boat!");
		
	}
	@Override
	void stop() {
		System.out.println("Stop the vehicle!");
		
	}
	

}
