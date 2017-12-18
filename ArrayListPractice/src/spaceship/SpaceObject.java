package spaceship;

public abstract class SpaceObject {
	private int xPosition;
	private int yPosition;
	private String direction;
	private double speed;
	
	public SpaceObject(int xPosition, int yPosition, String direction, double speed) {
		super();
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.direction = direction;
		this.speed = speed;
	}
	public SpaceObject() {
		super();

	}
	public int getxPosition() {
		return xPosition;
	}
	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}
	public int getyPosition() {
		return yPosition;
	}
	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	@Override
	public String toString() {
		return "SpaceObject [xPosition=" + xPosition + ", yPosition=" + yPosition + ", direction=" + direction
				+ ", speed=" + speed;
	}
	
}
