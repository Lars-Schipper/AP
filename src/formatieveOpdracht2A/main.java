package formatieveOpdracht2A;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
        String S = new String("BAAB ");
        String a = new String("A");
        String b = new String("B");
        int state = 0;
        ArrayList<String> locaties = new ArrayList<String>();


        for(int i = 0; i < S.length(); i++){
            char index = S.charAt(i);
            char A = a.charAt(0);
            char B = b.charAt(0);

            if(state == 0){
                locaties.add("S0");
                if(index == A){
                    state = 2;
                    System.out.println("we gaan naar state 2");
                }
                else if(index == B){
                    state = 1;
                    System.out.println("we gaan naar state 1");
                }
            }

            else if(state == 1){
                locaties.add("S1");
                if(index == A){
                    state = 1;
                    System.out.println("we blijfen in state 1");
                }

                else if(index == B){
                    state = 2;
                    System.out.println("we gaan naar state 2");
                }
            }

            else if(state == 2){
                locaties.add("S2");
                if(index == A){
                    System.out.println("we stoppen het programma");
                    break;
                }

                else if(index == B){
                    state = 3;
                    System.out.println("we gaan naar state 3");
                }
            }

            else if(state == 3){
                locaties.add("S3");
                if(index == A){
                    state = 3;
                    System.out.println("we blijfen in state 3");
                }

                else if(index == B){
                    state = 0;
                    System.out.println("we gaan naar state 0");
                }
            }
        }
        System.out.println("deze locaties hebben we bezocht " + locaties + " met de string: " + S);
    }
}
