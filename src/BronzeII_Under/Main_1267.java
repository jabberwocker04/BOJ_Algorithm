package BronzeII_Under;

import java.util.Scanner;

public class Main_1267 {
    public static void main(String[] args) throws Exception {

        // 1. Y ???κΈμ  1μ΄?~29μ΄? = 10?/ 30μ΄?~59μ΄? = 20?

        // 2. M λ―Όμ ?κΈμ  1μ΄?~59μ΄? = 15?/ 60μ΄?~119μ΄? = 30?

        Scanner sc = new Scanner(System.in);

        //int a;  ?΅?? κ°μ N=<20 -> j
        //int b;  ?΅??κ°? =<10000 // -> +++

        int Y=0, M=0;
        int j = sc.nextInt();

        for(int i=0; i<j; i++) {
            int num = sc.nextInt();
            Y = Y + ((num / 30) + 1) * 10; //?? ₯λ°μ? ?κ°λ€ λͺ¨λ ??? 30?Όλ‘? ??
            // 0?΄?? ? ? ??Ό? +1 ? ? 10??© μ²?κ΅?
            M = M + ((num / 60) + 1) * 15;

        }

        if (Y == M) {
            System.out.print("Y M " + Y);
        } else if (Y > M)
            System.out.print("M " + M);
        else if (Y < M)
            System.out.print("Y " + Y);


    }
}
