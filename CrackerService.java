package hack;
import hack.CrackerFactory;
import hack.Cracker;

import java.util.*;

public class CrackerService {
    public static void main(String[] args) {
        CrackerFactory crackerFactory = new CrackerFactory();
        Scanner sc = new Scanner(System.in);
        String mdp;
        String method;

        System.out.print("veuillez Saisir votre mot de passe : ");
        mdp = sc.nextLine();
        System.out.println(mdp);

        System.out.print("What hacking method do you want to use: ");
        method = sc.nextLine();
        System.out.println(method);

        Cracker cracker = crackerFactory.algo("DICTIONNARY");
        cracker.hack(mdp);
    }
}
