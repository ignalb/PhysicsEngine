package util;

public class Vector2 {

	double x, y;
	
	public Vector2(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public static Vector2 add(Vector2... vectors){
		int x = 0, y = 0;
		for(Vector2 v : vectors){
			x += v.x;
			y += v.y;
		}
		return new Vector2(x, y);
	}
	
	
}
