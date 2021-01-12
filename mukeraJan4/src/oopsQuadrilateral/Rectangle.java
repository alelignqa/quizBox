package oopsQuadrilateral;

public abstract class Rectangle implements BaseOfQuadrilateral {
	

	public void agle() {
		 System.out.println("Any quadrilateral should have four angles ");
		
	}

	public void side() {
		System.out.println("Any quadrilaterl also need to have four sides ");
	}
	public void equalS() {
		System.out.println("A quadrilater to be a rectangle atleast Opposite sides should be equal");
	}
	
	public abstract void equalAngles();
}
