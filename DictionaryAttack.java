package hack;
import hack.Cracker;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class DictionaryAttack implements Cracker  {

    int compteur = 0;
    @Override
    public void hack(String mdp) {
        try {
            FileInputStream file = new FileInputStream("dictionaire.txt");
            Scanner myReader = new Scanner(file);

            while (myReader.hasNextLine()) {
                String password = myReader.nextLine();
                compteur++;
                if(mdp.equals(password)) {
                    System.out.println("mot de passe trouve : " + mdp + "\n nombre de tentative" + compteur );
                }
            }
            if(myReader.hasNextLine()) {
                System.out.println("Password not foud");
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    }

