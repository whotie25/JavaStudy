package BasicConcepts;

import java.util.Scanner;

class _010_Player {	
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
}

public class _010_InstanceAndObject {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What's your name? : ");
		String getStr = sc.next();
		sc.close();
		
		_010_Player player = new _010_Player();
		player.setStat(getStr, 100, 10);
		player.getStat();
	}
}