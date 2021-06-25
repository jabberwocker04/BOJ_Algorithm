package BronzeII_Under;

import java.util.Scanner;

public class Main_1267_solved {
    public static void main(String[] args) throws Exception {

        // 1. Y ?��?��?��금제 1�?~29�? = 10?��/ 30�?~59�? = 20?��

        // 2. M 민식 ?��금제 1�?~59�? = 15?��/ 60�?~119�? = 30?��

        Scanner sc = new Scanner(System.in);

        //int a;  ?��?��?�� 개수 N=<20 -> j
        //int b;  ?��?��?���? =<10000 // -> +++

        int Y=0, M=0;
        int j = sc.nextInt();

        for(int i=0; i<j; i++) {
            int num = sc.nextInt();
            Y = Y + ((num / 30) + 1) * 10; //?��?��받�? ?��간들 모두 ?��?��?�� 30?���? ?��?��
            // 0?��?��?�� ?��?�� ?��?��?�� +1 ?�� ?�� 10?��?�� �?�?
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
