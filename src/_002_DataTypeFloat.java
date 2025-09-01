public class _002_DataTypeFloat {
	public static void main(String[] args) {
		/* float data type
		 * float(4), double(8) */
		
		//float type의 경우, 접미사로 'F' 또는 'f'를 붙여야 함.
		//double type의 경우, 'D' 또는 'd'를 붙여야 함. (생략 가능)

		//실수 자료는 부동소수점으로 표현되므로 오차가 발생할 수 있어, 경우에 따라 로직 구현에 신경 쓸 필요가 있음.
		float a = 0.1f, b = 0.2f;
		
		if(a+b == 0.3) System.out.println("0.1 + 0.2 = 0.3");
		else System.out.println("0.1 + 0.2 != 0.3\n"); //Floating Point
		
		//Stack Overflow in float
		double largeFloat = Double.MAX_VALUE;
		System.out.println("max of double             : " + largeFloat);
		System.out.println("2 * max of double         : " + largeFloat*2 + "\n"); //Overflow
		
		//Exponential Notation
		double exp = 2718e-3;
		System.out.println("e = " + exp + "...");
	}
}