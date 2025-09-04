import java.util.Scanner;

public class _009_StandardInputOutput{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Write any strings: ");
		
		String getStr = sc.nextLine();
		System.out.println("Strings you wrote: " + getStr);
		
		System.out.print("Write any pair of integer: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print(a + " + " + b + " = " + (a+b));
		
		sc.close();
	}
}