// 13410. 거꾸로 구구단
package Baekjoon;
import java.util.Scanner;

public class boj_13410 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String tmp;
		String rvsStr;
		int rvs;
		int max = 0;
		for(int i = 1; i <= b; i++) {
			tmp = ""+(a*i); //int to string
			rvsStr = "";
			for(int j = 0; j < tmp.length(); j++) {
				rvsStr += tmp.charAt(tmp.length()-1-j);
			} //string reversing
			rvs = Integer.parseInt(rvsStr); //string to int
			if(rvs > max) max = rvs;
		}
		System.out.print(max);
		sc.close();
	}
}