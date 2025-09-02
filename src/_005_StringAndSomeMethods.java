public class _005_StringAndSomeMethods {
	public static void main(String[] args) {
		String str_1 = "Algorithm"; //권장(literal 표기 방식)
		System.out.println(str_1);
		
		String str_2 = new String("Data Structure");
		System.out.println(str_2 + "\n");
		
		//some methods
		//.equals()
		System.out.print(str_1.equals("Algorithm") + ", ");
		System.out.println(str_1.equals(str_2));
		
		//.indexOf(), .contains(), .charAt()
		String latina = "Abi in malam crucem!";
		
		System.out.print(latina.indexOf("malam") + ", ");
		System.out.println(latina.indexOf("veritas"));
		
		System.out.print(latina.contains("malam") + ", ");
		System.out.println(latina.contains("veritas"));
		
		System.out.println(latina.charAt(2) + "\n");
		//System.out.println(latina.charAt(20)); -> Out of index
		
		//.replaceAll()
		System.out.println(latina.replaceAll("!", "?"));
		//System.out.println(latina.replaceAll('!', '?')); -> Type Error. (char -> String)
		System.out.println(latina + "\n");
		
		//.substring(), .to___Case()
		System.out.println(latina.substring(13, 19));
		System.out.println(latina.toUpperCase());
		System.out.println(latina.toLowerCase() + "\n");
		
		//.split()
		String[] splited = latina.split(" ");
		for(int i = 0; i < splited.length; i++) {
			System.out.print(splited[i]);
			if(i != splited.length-1) System.out.print("_");
		}
	}
}