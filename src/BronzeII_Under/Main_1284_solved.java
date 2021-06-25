package BronzeII_Under;

import java.util.Scanner;

public class Main_1284_solved {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while(true) {
            String a = sc.next();
            int count = 0;
            if (a.equals("0")) {
                System.exit(0);}

            for(int i=0; i<a.length(); i++) {
                String answer = a.substring(i, i+1);

                if(answer.equals("1")) {
                    count += 3;
                } else if(answer.equals("0")) {
                    count+= 5;
                } else { count+= 4;
                }

            }
            System.out.println(count+1);
        }

    }
}