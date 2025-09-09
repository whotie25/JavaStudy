package BasicConcepts;

import java.util.Scanner;
import java.util.ArrayList;

class _011_Player {
	static int playerCnt = 0;
	
	private String id;
	private int hp, att;
	
	public void setStat(String _id, int _hp, int _att) {
		this.id = _id;
		this.hp = _hp;
		this.att = _att;
	}
	
	public void getStat() {
		System.out.println("[ Player Information ]");
		System.out.printf("id : %s\nHP : %d\nAtt : %d\n", id, hp, att);
	}
	
	static void getPlayerCnt() {
		System.out.printf("Player Count : %d\n", playerCnt);
	}
}

public class _011_ClassVariables {
	public static void main(String[] args) {
		_011_Player player1 = new _011_Player();
		_011_Player player2 = new _011_Player();
		_011_Player player3 = new _011_Player();
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> idList = new ArrayList<>(3);
		for(int i = 0; i < 3; i++) {
			System.out.print("What's your name? : ");
			idList.add(sc.next());
		}
		sc.close();

		player1.setStat(idList.get(0), 100, 10);
		player2.setStat(idList.get(1), 100, 10);
		player3.setStat(idList.get(2), 100, 10);

		player1.getStat();
		_011_Player.playerCnt++;
		_011_Player.getPlayerCnt();
		player2.getStat();
		_011_Player.playerCnt++;
		_011_Player.getPlayerCnt();
		player3.getStat();
		_011_Player.playerCnt++;
		_011_Player.getPlayerCnt();
	}
}