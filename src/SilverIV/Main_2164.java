	package SilverIV;
	
	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.util.LinkedList;
	
	public class Main_2164 {
	
		public static void main(String[] args) throws Exception { // card2
	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
			int[] n_array = new int[n];
			LinkedList<Integer> card = new LinkedList<Integer>();
			for(int i = n; i>0; i--) {
				card.add(i);
			}//카드 수 입력
			
			for(int i=0; i<n_array.length-1; i++) {
				
				card.removeLast();
	//			System.out.println(card.toString());
				card.addFirst(card.removeLast());
	//			System.out.println(i+"번째 규칙 끝");	
			}
			System.out.println(card.getFirst());
		}
	}
