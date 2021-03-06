package ar.edu.unq.tip.model;

public class Bus extends Entity {

	private static final long serialVersionUID = -2456253918188565568L;
	private int internal;
	private String directionOfTravel;
	private Position position;
	private String routeWay;
	private String routeBack;
	
	public Bus() { }
	
	public Bus(int internal, String directionOfTravel, Position position, String routeWay, String routeBack) {
		this.internal = internal;
		this.directionOfTravel = directionOfTravel;
		this.position = position;
		this.routeWay = routeWay;
		this.routeBack = routeBack;
	}
	
	public void updatePosition(Position newPosition){
		this.setPosition(newPosition);
	}
	
	public void changeDirectionOfTravel(String newDirection){
		this.setDirectionOfTravel(newDirection);
	}

	public int getInternal() {
		return internal;
	}
	
	public void setInternal(int internal) {
		this.internal = internal;
	}
	
	public String getDirectionOfTravel() {
		return directionOfTravel;
	}
	
	public void setDirectionOfTravel(String directionOfTravel) {
		this.directionOfTravel = directionOfTravel;
	}
	
	public Position getPosition() {
		return position;
	}
	
	public void setPosition(Position position) {
		this.position = position;
	}

	public String getRouteWay() {
		return routeWay;
	}

	public void setRouteWay(String routeWay) {
		this.routeWay = routeWay;
	}

	public String getRouteBack() {
		return routeBack;
	}

	public void setRouteBack(String routeBack) {
		this.routeBack = routeBack;
	}
}
