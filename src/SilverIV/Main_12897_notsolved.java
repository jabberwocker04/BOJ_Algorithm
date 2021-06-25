package SilverIV;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main_12897_notsolved {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String k = br.readLine();
		int c = Integer.parseInt(k);
		long sum1 = 0;
		
		for(int i=0; i<=c; i++) {
			sum1 = (long) (sum1 +  ((Math.pow(2, i)) * a(c, i)));
			//System.out.println("i는"+i+"일 때, sum1은"+sum1+"이다.");
		}
		System.out.println(sum1-1);
	} // BigInteger문제와 2의 i제곱 * nCr이 제대로 되지 않는 곳에서 멈춤. 21.6.13

	public static long a(long n,long r) { // nCk 구현 (n! / r!*n-r!)
		if(n==r || r==0) return 1;
	    return a(n-1, r-1) + a(n-1,r);

	}
}
