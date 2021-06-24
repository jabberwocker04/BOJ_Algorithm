package WithStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1296 {

	public static void main(String[] args) throws IOException {

		//민식이가 데이트함 N명과
		//사랑계산기 -> 이름에서 LOVE를 뽑아서 계산함
		//계산식은 ((L+O)*(L+V)*(L+E)*(O+V)*(O+E)*(V_E)) mod 100
		//가장 높은 여자를 출력 / 여러명일때는 알파벳으로 가장 앞서는 사람
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String minsik = br.readLine();
		String dategirl;
		boolean zerogirl = true;
		
		String zeroresult = "ZZZZZZZZZZZZZZZZZZZZ";
		int TestCase = Integer.parseInt(br.readLine());
		int max = 0;
		String answer = "";
		
		for(int i=0; i<TestCase; i++) {
			dategirl = br.readLine();
			if(Lovecalculater(dategirl) > 0) {
				if(max < Lovecalculater(dategirl)) {
				max = Lovecalculater(dategirl);
				zeroresult = dategirl;
				zerogirl = false;
				} else if (max >= Lovecalculater(dategirl)) {
					if (answer.compareTo(dategirl) < 0 ) {
						answer = answer;
					} else {
						answer = dategirl;
					}
				}
			}
			
			else if( Lovecalculater(dategirl) == 0) {
				if( zeroresult.compareTo(dategirl) > 1) {
				zeroresult = dategirl;
				}
			}
		}
		
		if(zerogirl == true) {
			System.out.println(zeroresult);
			} else if(max != 0) {
				System.out.println(zeroresult);
				
			}
	}
	
		//출력
		
	
public static int Lovecalculater(String dategirl) {
		int L=0;
		int O=1;
		int V=0;
		int E=0;
		int love = 0;
		String[] a = dategirl.split("");
		for(int i=0; i<a.length; i++) {
			if(a[i].equals('L')) {
				L = L+1;
			} else if(a[i].equals('O')) {
				O = O+1;
			} else if(a[i].equals('V')) {
				V = V+1;
			} else if(a[i].equals('E')) {
				E = E+1;
			}
		}
		love = ((L+O)*(L+V)*(L+E)*(O+V)*(O+E)*(V+E)%100);
	return love;
		}
	}

