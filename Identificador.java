import java.util.Scanner;

public class Identificador {
    public void leTexto(){
        Scanner sc = new Scanner(System.in);
        String palavra;
        System.out.println("Digite uma frase:  ");
        while (sc.hasNext()){
            palavra = sc.next();
            if (palavra.charAt(0) >= '0' && palavra.charAt(0) <= '9'){
                System.out.print(palavra + " n");
            }
            else {
                System.out.print(palavra + " i");
            }
            System.out.print(" ");
            if (palavra.charAt(palavra.length() - 1) == '.'){
                break;
            }
        }

    }
}
