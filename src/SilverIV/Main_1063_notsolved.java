package SilverIV;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.StringTokenizer;

public class Main_1063_notsolved {

	public static void main(String[] args) throws Exception {
		//ŷ
		
		boolean[][] Chess = new boolean [8][8];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String[] a = st.nextToken().split("");
		String[] b = st.nextToken().split("");
		
		
		a[0] =  what(a[0]);
		b[0] =  what(b[0]);
		
		int c = Integer.parseInt(st.nextToken());
		
		Chess[8 -Integer.parseInt(a[1])][Integer.parseInt(a[0])] = true;
		Chess[8 -Integer.parseInt(b[1])][Integer.parseInt(b[0])] = true;
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				System.out.print(Chess[i][j]+" ");
			}
			System.out.println("");
		}
		
		for(int i=0; i<c; i++) {
			try {
			st = new StringTokenizer(br.readLine());
			
			if(st.nextToken().equals("R")) {
				R();
			}
			if(st.nextToken().equals("L")) {
				L();
			}
			if(st.nextToken().equals("B")) {
				B();
			}
			if(st.nextToken().equals("T")) {
				T();
			}
			if(st.nextToken().equals("RT")) {
				RT();
			}
			if(st.nextToken().equals("LT")) {
				LT();
			}
			if(st.nextToken().equals("RB")) {
				RB();
			}
			if(st.nextToken().equals("LR")) {
				LB();
			}
			} //try
			catch(Exception e) {
				break;
			} // catch
		}
		
	}
	public static String what(String a) {
		if(a.equals("A")) {
			a = "0";
		} else if(a.equals("B")) {
			a = "1";
		} else if(a.equals("C")) {
			a = "2";
		} else if(a.equals("D")) {
			a = "3";
		} else if(a.equals("E")) {
			a = "4";
		} else if(a.equals("F")) {
			a = "5";
		} else if(a.equals("G")) {
			a = "6";
		} else if(a.equals("H")) {
			a = "7";
		}
		System.out.println(a);
		return a;
	}
	
	
	
	public static boolean R(boolean[][] a, boolean[][] b) {
		
		
		
		return a, b;
	}
	public static void L() {
			
		}
	public static void B() {
		
	}
	public static void T() {
		
	}
	public static void RT() {
		
	}
	public static void LT() {
		
	}
	public static void RB() {
		
	}
	public static void LB() {
		
	}
}
