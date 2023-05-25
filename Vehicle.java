
public class Vehicle {

	String ViosSpeed = "190";
	String Vioscolor = "Silver";
	String Viosprice = "Php 946,000";
	
	String SpySpeed = "690";
	String Spycolor = "Sea Blue";
	String Spyprice = "Php 2,798,725,000.00";
	
	
	String FandangoSpeed = "9 ";
	String Fandangocolor = "White";
	String Fandangoprice = "Php 98,985,000.00";
	
	
	void stop() {
		System.out.println("Vehicle Stopped");
		
	}
	
		public static void main(String[] args) {
		    Car vios = new Car();
		    
		    
			System.out.println("\nTOYOTA VIOS SPECIFICATIONS: ");
			System.out.println("Name: " + vios.Name);
			System.out.println("Speed: " + vios.ViosSpeed + "km/h");
			System.out.println("Color: " + vios.Vioscolor);
			System.out.println("Price: " + vios.Viosprice);
		    System.out.println("Tire Type: " + vios.carTireType);
		    
		    vios.Drive();
		    vios.stop();
		    
		    System.out.println("----------------------------------------------------");
		    
		    
		    
		    Plane spy = new Plane();
		    
		    
			System.out.println("\nU-2 SPY PLANE SPECIFICATIONS: ");
			System.out.println("Name: " + spy.Name);
			System.out.println("Speed: " + spy.SpySpeed + "km/h");
			System.out.println("Color: " + spy.Spycolor);
			System.out.println("Price: p" + spy.Spyprice);
		    System.out.println("Tire Type: " + spy.SpyTireType);
		    
		    spy.Fly();
		    spy.stop();
	
		    System.out.println("----------------------------------------------------");
 
		    Boat yacht = new Boat();
		    
		    
			System.out.println("\nFandango Yacht SPECIFICATIONS: ");
			System.out.println("Name: " + yacht.Name);
			System.out.println("Speed: " + yacht.FandangoSpeed + "km/h");
			System.out.println("Color: " + yacht.MainSailColor);
			System.out.println("Price: p" + yacht.Fandangoprice);
			
		    
		    yacht.Float();
		    yacht.stop();
		}
}
