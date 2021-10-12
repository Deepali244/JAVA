package Point2D;


public class Point2D {

	private float x, y ;
	private float P1,P2;
	

	
	public void coordinates()
	{
		System.out.println("x co-ordinate:" + x);
		System.out.println("y co-ordinate:" + y);
	}
	
	
	public Point2D(float X, float Y)
	{
	 x=X;
	 y=Y;
	 	
	}
	
	public String getDetails()
	{
	   return "Point ("+x+","+y+")";
	   
	}
	
		public float getX() 
		{
		return x;
		}
		
		public float getY() 
		{
		return y;
		}

		
		public boolean isEqual(Point2D p2)
		{
			if(x==p2.getX() && y==p2.getY()) 
			{return true;}
			else 
			{return false;}
			
		}
		
	


		public Point2D  createNewPoint(float i, float j)
		{
			float ab = i + x;
			float cd = j + y;
			
			Point2D newPoint = new Point2D(ab,cd);
			return newPoint;
		}

}
