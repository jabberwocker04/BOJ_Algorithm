package BronzeI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_4344_notsolved {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T;
		T = Integer.parseInt(br.readLine());
		double avg = 0;
		for(int i=0; i<T; i++){
			int N = Integer.parseInt(br.readLine());
			double[] asdf = new double[N];
			double result = 0;
			int people = 0;
			for(int j=0; j<asdf.length; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				asdf[j] = (int) Integer.parseInt(st.nextToken());		
				avg = avg + asdf[j];
			}
			for(int j=0; j<asdf.length; j++) {
				if(avg<asdf[j]) {
					people = people +1;
				}
			}
			result = (people / asdf.length) * 100;
			
			System.out.printf("%.3f", result);
			
			
		}
	}
}
