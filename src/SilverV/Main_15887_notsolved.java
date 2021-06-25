package SilverV;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_15887_notsolved {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] card = new int[T];
		int[] answer = new int[T];
		int[] x = new int[1000001];
		int[] y = new int[1000001];
		for(int i=0; i<T; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		} // input
		for(int j=0; j<card.length; j++) {
			if(card[j]>card[j+1]) {
			for( int i=0; i<(card.length/2); i++) {
				int temp = card[i];
				card[i] = card[card.length-i-1];
				card[card.length-i-1]=temp;
				System.out.println(Arrays.toString(card));
				} // 리버스
			}
		}
		int idx = 0;
		
		
		System.out.println(Arrays.toString(card));
	}
}
