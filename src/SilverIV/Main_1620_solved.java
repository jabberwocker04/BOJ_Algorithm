package SilverIV;

import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.io.BufferedReader;
import java.util.StringTokenizer;


public class Main_1620_solved { // 예제 입력시 맞는데, 시간초과 뜸

	public static void main(String[] args) throws Exception {
		
		HashMap<Integer, String> hash = new HashMap<Integer, String>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		hash.put(0,  "empty");
		
		for(int i=1; i<a+1; i++) {
			hash.put(i, br.readLine());
		}
		
		/*
		for(int i=1; i<a+1; i++) {
			System.out.println(i+" "+hash.get(i));
		} // 입력확인용 for
		*/
		
		for(int i=0; i<b; i++) {
			String input = br.readLine();
			if(isStringDouble(input) == true ) { // 입력이 숫자일 때
				System.out.println(hash.get(Integer.parseInt(input)));
			} else { // 입력이 영어일 때
				System.out.println(getKey(hash, input));
			}
			
		}
			
			
		}
	
	public static boolean isStringDouble(String s) { //입력이 숫자인지 아닌지 판단
		try { 
			Double.parseDouble(s); 
			return true; 
		} 
		catch (NumberFormatException e) {
			return false; 
			} 
		} 
	public static <K, V> K getKey(Map<K, V> map, V value) { // getvalue 하는 메소드
        for (K key : map.keySet()) {
            if (value.equals(map.get(key))) {
                return key;
            }
        }
        return null;
		}
	}