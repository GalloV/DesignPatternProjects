package hack;

import java.util.*;


public class BruteForce implements Cracker{
  
    public static char[] charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    public static String tentative = "";

    @Override
    public void hack(String mdp ) {
        char[] charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        String tentative = new String();
        long start = System.currentTimeMillis();
        outerloop: for (int i = 0; i < charset.length; i++) {
            for (int j1 = 0; j1 < charset.length; j1++) {
                for (int j2 = 0; j2 < charset.length; j2++) {
                    for (int k = 0; k < charset.length; k++) {
                        for (int k2 = 0; k2 < charset.length; k2++) {
                            tentative = "" + charset[i] + charset[j1] + charset[j2] + charset[k] + charset[k2];
                            System.out.println(tentative);
                            if (tentative.equals(mdp)) {
                                System.out.println("mot de passe trouvé : " + tentative);
                                long end = System.currentTimeMillis();
                                System.out.println("temp :" + (end - start) / 1000);
                                break outerloop;
                            } else {
                                tentative = "";
                            }

                        }
                    }
                }
            }
        }
    }
}
