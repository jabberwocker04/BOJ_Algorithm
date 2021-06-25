package SilverV;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main_15688_notsolved {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		int[] a = new int[T];
		for(int i=0; i<T; i++ ) {
			a[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(a);
		
		for(int i=0; i<a.length; i++ ) {
			sb.append(a[i]+ "\n");
		}
		System.out.print(sb);
	}
}
