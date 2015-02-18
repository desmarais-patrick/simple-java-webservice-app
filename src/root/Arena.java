package root;

public class Arena {
	Player[] players = new Player[3];
	
	public Arena() {
		players[0] = new Player("SandorTheGreat", 50, 15);
		players[1] = new Player("ArianeTheMajestuous", 35, 25);
		players[2] = new Player("ClaudeTheHeavy", 75, 7);
	}
	
	public void battle(String player1Name, String player2Name) {
		Player player1 = getPlayer(player1Name);
		Player player2 = getPlayer(player2Name);
		
		int player1HitPts = player1.getHitPoints();
		int player2HitPts = player2.getHitPoints();
		
		player1.removeLifePoints(player2HitPts);
		player2.removeLifePoints(player1HitPts);
	}
	
	private Player getPlayer(String name) {
		for (Player p : players) {
			if (p.getName() == name) {
				return p;
			}
		}
		throw new Error("Player '" + name + "' does not exists!");
	}
}
