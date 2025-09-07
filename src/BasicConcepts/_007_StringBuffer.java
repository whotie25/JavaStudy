package BasicConcepts;

public class _007_StringBuffer{
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer(); //Mutable Type
		buffer.append("Hello");
		buffer.append(", ");
		buffer.append("World!");
		
		String str = buffer.toString();
		
		System.out.println(buffer);
		System.out.println(str + "\n");
		
		buffer = new StringBuffer("Dm7 - CM7");
		buffer.insert(4, "- G7 ");
		System.out.println(buffer);
		
		buffer.delete(0, 6);
		System.out.println(buffer);
	}
}