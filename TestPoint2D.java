package Point2D;

public class TestPoint2D 
{

	private static final String Y = null;

	public static void main(String[] args)
		
	{
		Point2D p=new Point2D(3,4);
		p.coordinates();
		
		Point2D p1 = new Point2D(40,30);
		Point2D p2 = new Point2D(40,30); 
	
		
		
		System.out.println("comparision between p1 and p2 : "+ p1.isEqual(p2));
		
		Point2D p3 = p1.createNewPoint(5,-2);
		
		System.out.println("for point 3: "+p3 .getDetails());
		
		
		Point2D a2 = p1.createNewPoint(5,-2);
		p3 = p1.createNewPoint(5,-2);
		
		
		
	}
}
