package spaceship;

public class Spaceship extends SpaceObject {
	private int ammo;
	private int lives;

	public Spaceship(int xPosition, int yPosition, String direction, double speed, int ammo, int lives) {

		super(xPosition, yPosition, direction, speed);
		this.ammo = ammo;
		this.lives = lives;
	}

	public int getAmmo() {
		return ammo;
	}

	public void setAmmo(int ammo) {
		this.ammo = ammo;
	}

	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}

	public void shoot() {
		int currentAmmo = this.getAmmo();
		currentAmmo -= 4;
		this.setAmmo(currentAmmo);
		System.out.println("Ammo Remaining: " + currentAmmo);
		if(currentAmmo == 0) {
			System.out.println("Out of Ammo");
		}
	}

	public void crash() {
		int currentLives = this.getLives();
		currentLives -= 1;
		this.setLives(currentLives);
		System.out.println("Remaining Lives: " + currentLives);
		if(currentLives == 0) {
			System.out.println("You Lose");
			this.setAmmo(100);
			this.setLives(3);
		}
	}

	@Override
	public String toString() {
		String str = super.toString();
		return str + ", ammo=" + ammo + ", lives=" + lives + "]";
	}
	
	
}
