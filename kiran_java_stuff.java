package hack;

public class kiran_java_stuff {

	public static void main(String[] args) {
		System.out.println("Loading the first train with default constructor..");
		Train train1 = new Train();
		System.out.println("Now, getting number of cars in first train with the help of getNumCars method whose value is " + train1.getNumCars());
		
		System.out.println("Setting number of cars in first train using the setNumCars method to 8");
		train1.setNumCars(8);
		System.out.println("Now, getting the number of cars in first train with the help of getNumCars method whose value is " + train1.getNumCars());
		
		System.out.println("Loading second train with 9 cars with the help of parameterized constructor..");
		Train train2 = new Train(9);
		System.out.println("Loading the number of cars in the first train with the help of getNumCars method whose value is " + train2.getNumCars());
		System.out.println("Setting number of cars using the setNumCars method in second train to 10");
		train2.setNumCars(10);
		System.out.println("Currently, loading the number of cars in second train with the help of getNumCar method whose value is " + train2.getNumCars());
		
		System.out.println("***********************************************************************************************************");
		Location location1 = new Location();
		System.out.println("Loading the first location with default constructor..");
		System.out.println("Getting the x coordinate of first location with the help of getXloc method whose value is " + location1.getXloc());
		System.out.println("Similarly getting the y coordinate of the first location with the help of getYloc method whose value is " + location1.getYloc());
		System.out.println("Adjusting the x coordinate of first location with the help of setXloc method to 15.25");
		location1.setXloc(15.25);
		System.out.println("Adjusting the y coordinate of first location using the setYloc method to 40.50");
		location1.setYloc(40.50);
		System.out.println("Currently, getting the x coordinate of first location with the help of getXloc method whose value is " + location1.getXloc());
		System.out.println("Getting the y coordinate of the first location using the getYloc method whose value is " + location1.getYloc());
		
		System.out.println("LOading the second location with x coordinate as 18.24 and y coordinate as 42.36 using the parameterized constructor..");
		Location location2 = new Location(18.24, 42.36);
		System.out.println("Getting the respective x coordinate of second location with the help of getXloc method whose value is " + location2.getXloc());
		System.out.println("Getting the respective y coordinate of second location with the help of getYloc method whose value is " + location2.getYloc());
		System.out.println("Adjusting the required x coordinate of second location with the help of setXloc method to 12.26");
		location2.setXloc(12.26);
		System.out.println("Similarly, adjusting the required y coordinate of second location using the setYloc method to 19.34");
		location2.setYloc(19.34);
		System.out.println("Getting the x coordinate of second location with the help of getXloc method whose value is " + location2.getXloc());
		System.out.println("Getting the y coordinate of second location with the help of getYloc method whose value is " + location2.getYloc());
	}

}


 class Train {
	
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
 class Location {
	
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
	public double getXloc() {
		return xLoc;
	}

	/*
	 * Sets the x location
	 */
	public void setXloc(double x) {
		xLoc = x;
	}
	
	/*
	 * Fetches the y location
	 */
	public double getYloc() {
		return yLoc;
	}
	
	/*
	 * Sets the y location
	 */
	public void setYloc(double y) {
		yLoc = y;
	}

}



