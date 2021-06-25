package BronzeII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.math.BigInteger;
import java.util.Hashtable;

public class Main_1076_solved {

	public static void main(String[] args) throws IOException {
		
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("black", "0-1");
		ht.put("brown", "1-10");
		ht.put("red", "2-100");
		ht.put("orange", "3-1000");
		ht.put("yellow", "4-10000");
		ht.put("green", "5-100000");
		ht.put("blue", "6-1000000");
		ht.put("violet", "7-10000000");
		ht.put("grey", "8-100000000");
		ht.put("white", "9-1000000000");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a= br.readLine();
		String b= br.readLine();
		String c= br.readLine();
		
		
		String a_1 = ht.get(a).split("-")[0];
		String b_1 = ht.get(b).split("-")[0];
		String c_1 = ht.get(c).split("-")[1];
		
		String ab = a_1+b_1;
		int ab_1 = Integer.parseInt(ab); // String�� int�� ��ȯ
		int c_2 = Integer.parseInt(c_1); // String�� int�� ��ȯ
		
		//long c3= Long.valueOf(c.split("-")[1]);
		//double lastc = Math.pow(10, c_2);
		
		long abc = Long.valueOf(ab_1) * Long.valueOf(ht.get(c).split("-")[1]);
		
		System.out.println(abc);
	}

}
