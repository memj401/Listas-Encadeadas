public class PilhaComFila {
    private Celula inicio;
    private Celula fim;
    private int totalDeElementos;

    private void insereNaFila(Object info){
        if (this.totalDeElementos == 0){
            Celula novo = new Celula(this.inicio,info);
            inicio = novo;
            fim = novo;
        }

        else {
            Celula novo = new Celula(info);
            this.fim.setProx(novo);
            this.fim = novo;
        }
    }

    public void retira(){
        if (this.totalDeElementos == 0){
            System.out.println("Erro! Lista Vazia");
        }

        else{
            this.inicio = this.inicio.getProx();
            this.totalDeElementos--;
        }
    }

    public void insere(Object info){
        if (this.totalDeElementos == 0){
            this.insereNaFila(info);
            this.totalDeElementos++;
        }

        else {
            PilhaComFila aux = new PilhaComFila();
            while(this.inicio != null){
                aux.insereNaFila(this.inicio.getInfo());
                aux.totalDeElementos++;
                this.retira();
            }
            this.insereNaFila(info);
            this.totalDeElementos++;
            while (aux.inicio != null){
                this.insereNaFila(aux.inicio.getInfo());
                this.totalDeElementos++;
                aux.retira();
            }
        }
    }

    public void imprimeLista(){
        if (this.totalDeElementos == 0){
            System.out.println("A lista está vazia");
        }
        else{
            Celula atual = this.inicio;
            for (int i = 0; i < this.totalDeElementos  && atual != null; ++i){
                System.out.print(atual.getInfo());
                System.out.printf("\n");
                atual = atual.getProx();
            }
        }

    }

    public int getTotalDeElementos(){
        return this.totalDeElementos;
    }


}
