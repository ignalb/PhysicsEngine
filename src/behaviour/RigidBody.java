package behaviour;

import java.util.ArrayList;
import java.util.Arrays;

import util.Vector2;

public class RigidBody extends GameObject {
	final double g = 9.81;
	
	double mass;
	Vector2 velocity, acceleration;
	boolean naturalGrav = true;		// Affected by local gravity where g = 9.81
	
	public RigidBody(String name){
		super(name);
		mass = 1;
		velocity = (naturalGrav) ? new Vector2(0, 9.81) : new Vector2(0, 0);
		acceleration = new Vector2(0, 0);
	}
	
	public void setMass(double m){
		mass = m;
	}
	public double getMass(){
		return mass;
	}
	public void setGrav(boolean grav){
		naturalGrav = false;
	}
	public boolean isGrav(){
		return naturalGrav;
	}
	
	public void addVelocity(Vector2... v){
		ArrayList<Vector2> vs = new ArrayList<Vector2>();
		vs.addAll(Arrays.asList(v));
		velocity = Vector2.add(vs.toArray(new Vector2[vs.size()]));
	}
	public void addAcceleration(Vector2... a){
		ArrayList<Vector2> as = new ArrayList<Vector2>();
		as.addAll(Arrays.asList(a));
		velocity = Vector2.add(as.toArray(new Vector2[as.size()]));
	}
	public void addForce(Vector2 F){
		addAcceleration(Vector2.multiply(F, 1/mass));
	}
	
}
