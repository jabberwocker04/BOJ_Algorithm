package SilverIV;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main_4949_notsolved {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			boolean blance = true;
			String a = br.readLine();
			String[] a_a = a.split("");
			for(int i=0; i<a_a.length; i++) {
				System.out.print(a_a[i]);
				if(a_a[i].equals("(")) {
					blance = false;
				}
			}
			System.out.println("");
			if(a.equals(".")){ // 종료 입력
				System.exit(0);
			}
		}
	}

}
