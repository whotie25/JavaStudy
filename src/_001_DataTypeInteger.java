public class _001_DataTypeInteger {
	public static void main(String[] args) {
		/* integer data type
		 * byte(1), short(2), int(4), long(8) */
		
		//data type이 long인 경우, 그 숫자가 "pow(2, 31) - 1"보다 크다면 접미사'L'을 붙여야 한다.
		
		//long largeNumber = 3000000000; -> Compile Error
		long largeNumber = 3000000000L;
		System.out.println("largeNumber : " + largeNumber + "\n");
		
		byte num = 127;
		System.out.println("num     : " + num);
		System.out.println("num + 1 : " + ++num + " (Stack Overflow)\n");
		
		int base_2 = 0b1011;
		System.out.println("base_2  : " + base_2);
		
		int base_8 = 023;
		System.out.println("base_8  : " + base_8);
		
		int base_16 = 0x1A;
		System.out.println("base_16 : " + base_16 + "\n");
		
		//Java에서 위 세가지 진법 표현은 int 자료형에 해당한다.
		
		//byte negative = 0xFF; -> Type Error
		byte negative = (byte) 0xFF; //Type Casting
		System.out.println("negative : " + negative);
	}
}