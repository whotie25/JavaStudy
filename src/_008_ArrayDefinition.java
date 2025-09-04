public class _008_ArrayDefinition{
	public static void main(String[] args) {
		//Methods to define an array
		//1. type[] name = {...};
		int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
		for(int i = 0; i < prime.length-1; i++) {
			System.out.print(prime[i] +", ");
		}
		System.out.println(prime[prime.length-1] + "\n");
		
		//2. type[] name = new type[size];
		String[] inventory = new String[5];
		inventory[0] = "익히지 않은 랩터의 고기 (Lv. 12)";
		inventory[1] = "빈 깡통 (Lv. 20)";
		inventory[2] = "빈 깡통 (Lv. 20)";
		inventory[3] = "편백나무 막대기 (Lv. 15)";
		inventory[4] = "빈 깡통 (Lv. 20)";
		
		for(int i = 0; i < inventory.length; i++) {
			System.out.println(inventory[i]);
		}
		
		System.out.println();
		
		for(String item : inventory) {
			System.out.println(item);
		}
		
		System.out.println();
		
		int[] zeroArray = new int[3];
		for(int value : zeroArray) {
			System.out.print(value + " ");
		}
	}
}