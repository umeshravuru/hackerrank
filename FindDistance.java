package beer_night;

public class FindDistance {
	
	/*
	 * Calculates the distance between two locations assuming that travel is only possible either parallel to x axis or y axis
	 */
	public static double travelDistance(Location l1, Location l2){
		double dist = 0.0;
		
		// Calculating the sum of distance along x-axis and along y-axis
		dist = Math.abs(l1.getxloc() - l2.getxloc()) + Math.abs(l1.getxloc() - l2.getxloc());
		
		return dist;
	}

	public static void main(String[] args) {
		// Initiating an instance of class "Train" and initializing the number of cars to 87 using the constructor
		Train train1 = new Train(87);
		
		// Initiating another instance of class "Train" using the default constructor, which sets the number of cars to 0 
		Train train2 = new Train();
		
		
		//Assigning the number of cars in train2 to 102 using the setNumCars method
		train2.setNumCars(102);
		
		// Initiating an instance of class "Location" (Rolla) using the default constructor (0,0)
		Location rolla = new Location();
		
		// Initiating an instance of class "Location" (Denver) with values (50, 300) using the parameterized constructor  
		Location Denver = new Location(50.0, 300.0);
		
		// Calculating the distance train1 has to travel from Rolla to Denver
		double distanceRolaToDenver = travelDistance(rolla, Denver);
		
		System.out.println("Travelling distance between Rolla (" + rolla.getxloc() + "," + rolla.getxloc() + ") and Denver (" + Denver.getxloc() + "," + Denver.getxloc() + ") is " + distanceRolaToDenver + "units");
		
		// Resetting the Rolla location and assigning the x coordinate to 10 using the setxLoc method
		rolla.setxloc(10.0);
		
		// Resetting the Rolla location and assigning the y coordinate to 20 using the setyLoc method
		rolla.setxloc(20.0);
		
		// Re-calculating the distance train1 has to travel from Rolla to Denver
		distanceRolaToDenver = travelDistance(rolla, Denver);
		
		System.out.println("Travelling distance between Rolla (" + rolla.getxloc() + "," + rolla.getyloc() + ") and Denver (" + Denver.getxloc() + "," + Denver.getxloc() + ") is " + distanceRolaToDenver + "units");
	}

	
	
	public static class Train {
			
			private int numCars;
			
			/*
			 * Default constructor that initializes the number of cars in train to 0
			 */
			public Train(){
				numCars = 0;
			}
			
			/*
			 * Constructor that initializes the number of cars in train to the value of supplied parameter 
			 */
			public Train(int numberOfCars){
				numCars = numberOfCars;
			}
			
			/*
			 * Fetches number of cars in a train
			 */
			public int getNumCars() {
				return numCars;
			}

			/*
			 * Set the number of cars in a train
			 */
			public void setNumCars(int numCars) {
				this.numCars = numCars;
			}

		}
	





/*
 * Class Location
 */
public static class Location {
	
	private double xLoc;
	private double yLoc;
	
	/*
	 * Default constructor which initializes state variables i.e. xLoc and yLoc to 0.0
	 */
	public Location(){
		xLoc = 0.0;
		yLoc = 0.0;
	}
	
	/* 
	 * Constructor that initializes xLoc and yLoc to the value of supplied parameters 
	 */
	public Location(double x, double y){
		xLoc = x;
		yLoc = y;
	}
	
	/*
	 * Fetches the x location
	 */
	public double getxloc() {
		return xLoc;
	}

	/*
	 * Sets the x location
	 */
	public void setxloc(double x) {
		xLoc = x;
	}
	
	/*
	 * Fetches the y location
	 */
	public double getyloc() {
		return yLoc;
	}
	
	/*
	 * Sets the y location
	 */
	public void setyloc(double y) {
		yLoc = y;
	}

}

}





