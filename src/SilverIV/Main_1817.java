package SilverIV;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1817 {

	public static void main(String[] args) throws Exception {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int[] a_array = new int[a];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<a; i++) {
			a_array[i] = Integer.parseInt(st.nextToken());
		}
		int count = 0;
		Arrays.sort(a_array);
		while(true) {
			
		}
		
	}
}
