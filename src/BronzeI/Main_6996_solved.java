package BronzeI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_6996_solved {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Testcase = Integer.parseInt(br.readLine());

		for(int i=0; i<Testcase; i++) {
			String Line = br.readLine();
			String[] Anagram = Line.split(" ");
			String[] A = Anagram[0].split("");
			String[] B = Anagram[1].split("");
			Arrays.sort(A);
			Arrays.sort(B);
			boolean q6996 = true;

			if(A.length>B.length) {
				System.out.println(Anagram[0]+" & "+Anagram[1]+" are NOT anagrams.");
				continue;
			}
			
			for(int j=0; j<A.length; j++) {
				if(A[j].equals(B[j]) == false ) {	
					q6996 = false;
				}
			}
			if(q6996 == true) {
				System.out.println(Anagram[0]+" & "+Anagram[1]+" are anagrams.");				
			} else {
				System.out.println(Anagram[0]+" & "+Anagram[1]+" are NOT anagrams.");				
			}
		}
		
	}
}