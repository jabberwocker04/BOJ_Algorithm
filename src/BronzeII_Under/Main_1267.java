package BronzeII_Under;

import java.util.Scanner;

public class Main_1267 {
    public static void main(String[] args) throws Exception {

        // 1. Y ?˜?‹?š”ê¸ˆì œ 1ì´?~29ì´? = 10?›/ 30ì´?~59ì´? = 20?›

        // 2. M ë¯¼ì‹ ?š”ê¸ˆì œ 1ì´?~59ì´? = 15?›/ 60ì´?~119ì´? = 30?›

        Scanner sc = new Scanner(System.in);

        //int a;  ?†µ?™”?˜ ê°œìˆ˜ N=<20 -> j
        //int b;  ?†µ?™”?‹œê°? =<10000 // -> +++

        int Y=0, M=0;
        int j = sc.nextInt();

        for(int i=0; i<j; i++) {
            int num = sc.nextInt();
            Y = Y + ((num / 30) + 1) * 10; //?…? ¥ë°›ì? ?‹œê°„ë“¤ ëª¨ë‘ ?”?•œ?›„ 30?œ¼ë¡? ?‚˜?ˆ”
            // 0?´?•˜?Š” ? ?ˆ˜ ?—†?œ¼?‹ˆ +1 ?•œ ?›„ 10?›?”© ì²?êµ?
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
