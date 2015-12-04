package behaviour;

public class GameObject extends Element {
	double xPos, yPos;
	double xScale, yScale;
	double rotation;
	
	public GameObject(String name){
		super(name);
		//Default Values
		xPos = 0;
		yPos = 0;
		xScale = 1;
		yScale = 1;
		rotation = 0;
	}
	
	public void setXPos(double x){
		xPos = x;
	}
	public void setYPos(double y){
		yPos = y;
	}
	public void setRotation(double T){
		rotation = T % 360;
	}
	public void setXScale(double x){
		xScale = x;
	}
	public void setYScale(double y){
		yScale = y;
	}
	public double getXPos(){
		return xPos;
	}
	public double getYPos(){
		return yPos;
	}
	public double getRotation(){
		return rotation;
	}
	public double getXScale(){
		return xScale;
	}
	public double getYScale(){
		return yScale;
	}
	
}
