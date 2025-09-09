package BasicConcepts;

class _012_Player {
	private static int playerCnt = 0;
	
	private String id;
	private int hp, att;
	
	public _012_Player(String _id) {
		this.id = _id;
		playerCnt++;
	}
	
	public static void getPlayerCnt() {
		System.out.printf("Player Count : %d\n", playerCnt);
	}
	
	public void setStat(int _hp, int _att) {
		this.hp = _hp;
		this.att = _att;
	}
	
	public void getStat() {
		System.out.println("[ Player Information ]");
		System.out.printf("id : %s\nHP : %d\nAtt : %d\n", id, hp, att);
	}
}

public class _012_Constructor {
	public static void main(String[] args) {
		_012_Player.getPlayerCnt();
		
		_012_Player player = new _012_Player("player0909");
		_012_Player.getPlayerCnt();
		
		player.setStat(100, 10);
		
		player.getStat();
	}
}