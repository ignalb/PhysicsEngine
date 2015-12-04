package util;

public class Vector2 {

	double x, y;
	
	public Vector2(double x, double y){
		this(x, y, false);
	}
	/***
	 * Constructor for Vector2
	 * @param x if withDir is true, a = Direction, else, a = x
	 * @param y if withDir is true, b = Magnitude, else, b = y
	 * @param withDir Controls different constructor modes
	 */
	public Vector2(double a, double b, boolean withDir){
		if(withDir){
			x = b * Math.cos(a);
			y = b * Math.sin(a);
		} else {
			x = a;
			y = b;
		}
	}
	
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	public double getMagnitude(){
		return Math.sqrt(x*x + y*y);
	}
	public double getDirection(){
		return Math.tan(y/x) % 360;
	}
	public void setX(double x){
		this.x = x;
	}
	public void setX(double dir, double mag){
		x = mag * Math.cos(dir);
	}
	public void setY(double y){
		this.y = y;
	}
	public void setY(double dir, double mag){
		y = mag * Math.sin(dir);
	}
	public void setDirection(double dir){
		setX(dir, getMagnitude());
		setY(dir, getMagnitude());
	}
	public void setMagnitude(double mag){
		setX(getDirection(), mag);
		setY(getDirection(), mag);
	}
	
	public static Vector2 multiply(Vector2 vector, double mag){
		vector.setMagnitude(vector.getMagnitude() * mag);
		return vector;
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
