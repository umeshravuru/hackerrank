package test;

import java.util.Scanner;

abstract class Distance {
	protected int feet;
	protected float inches;

	abstract public void setFeetAndInches(int feet, float inches);

	abstract public int getFeet();

	abstract public float getInches();

	abstract String getDistanceComparison(Distance dist2);
}

class DistanceImplementation extends Distance {

	@Override
	public void setFeetAndInches(int feet, float inches) {
		// TODO Auto-generated method stub
		this.feet = feet;
		this.inches = inches;

	}

	@Override
	public int getFeet() {
		// TODO Auto-generated method stub
		return feet * 12;
	}

	@Override
	public float getInches() {
		// TODO Auto-generated method stub
		return inches;
	}

	@Override
	String getDistanceComparison(Distance dist2) {
		// TODO Auto-generated method stub
		String dist1_big = "First distance is greater.";
		String dist2_big = "Second distance is greater.";
		String same = "Both distances are equal.";
		if ((float) getFeet() + getInches() > (float) dist2.getFeet() + getInches())
			return dist1_big;
		else if ((float) getFeet() + getInches() < (float) dist2.getFeet() + getInches())
			return dist2_big;
		else
			return same;
	}

}

public class DistanceCalculator {
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Distance dist1 = new DistanceImplementation();
		Distance dist2 = new DistanceImplementation();

		int feet1 = scan.nextInt();
		float inches1 = scan.nextFloat();

		int feet2 = scan.nextInt();
		float inches2 = scan.nextFloat();

		dist1.setFeetAndInches(feet1, inches1);
		dist2.setFeetAndInches(feet2, inches2);

		System.out.println(dist1.getDistanceComparison(dist2));
	}
}