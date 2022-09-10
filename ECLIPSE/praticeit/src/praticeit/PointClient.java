package praticeit;

public class PointClient {
	public static void main(String[] args) {
		// construct two Point objects, one at (8, 2) and one at (4, 3)
		Point1 p1 = new Point1(8, 2);
		Point1 p2 = new Point1(4, 3);

		// display the two Point objects' state
		System.out.println("p1 is " + p1);
		System.out.println("p2 is " + p2);

		// display p1 distance from origin
		System.out.println("p1's distance from origin is " + p1.distanceFromOrigin());

		// translate p1 to (9, 4)
		p1.translate(1, 2);
		// translate p2 to (3, 13)
		p2.translate(-1, 10);

		// display the two Point objects' state again
		System.out.println("p1 is now " + p1);
		System.out.println("p2 is now " + p2);
	}
}
