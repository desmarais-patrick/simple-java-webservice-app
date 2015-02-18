package root;

import java.util.Random;

public class Player {
	private String name;
	
	private int originalLifePoints;
	private int lifePoints;
	
	private int hitPoints;
	private static Random rand = new Random();
	
	public Player(String name, int lifePoints, int hitPoints) {
		this.name = name;
		this.lifePoints = this.originalLifePoints = lifePoints;
		this.hitPoints = hitPoints;
	}
	
	public String getName() {
		return name;
	}
	
	public int getHitPoints() {
		return rand.nextInt(hitPoints);
	}
	
	public int getLifePoints() {
		return lifePoints;
	}
	
	public void removeLifePoints(int points) {
		if (lifePoints <= points) {
			lifePoints = 0;
			return;
		}
		lifePoints -= points;
	}
	
	public boolean areLifePointsDepleted() {
		if (lifePoints == 0) {
			return true;
		}
		return false;
	}
	
	public void resetLifePoints() {
		lifePoints = originalLifePoints;
	}
}
