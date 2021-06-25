package SilverIV;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main_5671_solved { // 6/21용

	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";

        while((input=br.readLine())!=null) {
            String[] str = input.split(" ");

            int N = Integer.parseInt(str[0]);
            int M = Integer.parseInt(str[1]);
            int cnt = 0;

            loop:for(int i=N; i<=M; i++) {
                boolean[] bool = new boolean[10];
                String num = Integer.toString(i);

                for(int j=0; j<num.length(); j++) {
                    int n = num.charAt(j)-'0';

                    if(bool[n]) continue loop;
                    else bool[n] = true;
                }
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}