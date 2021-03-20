import java.util.*;

public class Inverte {
    public void inverteFrase() {
        Scanner sc = new Scanner(System.in);
        String palavra;
        int indice;
        System.out.println("Digite uma frase(Digite Quit para sair do programa):  ");
        while (sc.hasNext()) {
            palavra = sc.next();
            if (palavra.equals("Quit") || palavra.equals("quit")){
                break;
            }
            for (int i = 0; i < palavra.length(); ++i){
                indice = (palavra.length() - 1) - i;
                System.out.print(palavra.charAt(indice));
            }
            System.out.print(" ");

        }

    }
}
