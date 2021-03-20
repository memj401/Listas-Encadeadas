public class Pilha {
    private Celula topo;
    private int totalDeElementos;

    public void insere(Object info) {
        Celula novo = new Celula(this.topo, info);
        this.topo = novo;
        this.totalDeElementos++;
    }

    public void retira() {
        if (this.totalDeElementos == 0) {
            System.out.println("Não foi possível reitrar. A pilha está vazia.");
        } else {
            this.topo = this.topo.getProx();
            this.totalDeElementos--;
        }
    }

    public int getTotalDeElementos() {
        return totalDeElementos;
    }

    public void imprimeLista(){
        if (this.totalDeElementos == 0){
            System.out.println("A lista está vazia");
        }
        else{
            Celula atual = this.topo;
            for (int i = 0; i < this.totalDeElementos ; ++i){
                System.out.print(atual.getInfo());
                System.out.printf("\n");
                atual = atual.getProx();
            }
        }

    }


}