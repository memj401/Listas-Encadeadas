import java.util.*;

public class Palindromo {
    private Celula inicio;
    private Celula fim;
    private int numElementos;

    private void insere(Object info){
        if (this.numElementos == 0){
            Celula novo = new Celula(this.inicio, info);
            this.inicio = novo;
            this.fim = novo;
            this.numElementos++;
        }
        else{
            Celula novo = new Celula(info);
            novo.setProx(null);
            novo.setAnt(fim);
            this.fim.setProx(novo);
            this.fim = novo;
            this.numElementos++;
        }

    }

    public void leFrase(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a frase: ");
        String frase = sc.nextLine();
        for (int i = 0; i < frase.length(); ++i){
            this.insere(frase.charAt(i));
        }

    }

    public boolean vePalindromo(){
        Celula aux1 = this.inicio;
        Celula aux2 = this.fim;
        while(aux1 != aux2 && aux2.getProx() != aux1){
            if (aux1.getInfo() != aux2.getInfo()){
                return false;
            }

            else{
                aux1 = aux1.getProx();
                aux2 = aux2.getAnt();
            }
        }
        return true;
    }

    public void resposta(boolean resposta){
        if (resposta){
            System.out.println("É Palíndromo");
        }

        else{
            System.out.println("Não é Palíndromo");
        }
    }

    public void imprimeLista(){
        if (this.numElementos == 0){
            System.out.println("A lista está vazia");
        }
        else{
            Celula atual = this.inicio;
            for (int i = 0; i < this.numElementos ; ++i){
                System.out.print(atual.getInfo());
                System.out.printf("\n");
                atual = atual.getProx();
            }
        }

    }




}
