public class ListaCircular {
    private Celula inicio;
    private Celula fim;
    private int numDeElementos;

    private void insereInicio(Object info){

        Celula nova =  new Celula(this.inicio, info);
        this.inicio = nova;
        if (this.numDeElementos == 0){
            this.fim = nova;
        }
        else {
            this.fim.setProx(nova);
        }
        this.numDeElementos++;
    }

    private void insereFinal(Object info){

        Celula nova = new Celula(this.inicio,info);
        this.fim.setProx(nova);
        this.fim = nova;
        this.numDeElementos++;

    }

    private void retiraInicio(){
        if (this.numDeElementos == 1){
            this.inicio = null;
            this.fim = null;
        }
        else {
            this.inicio = this.inicio.getProx();
        }
        this.numDeElementos--;
    }

    private void retiraFim(){
       if (this.numDeElementos == 1){
           this.retiraInicio();
       }
       else {
           Celula ant = this.SEARCH(this.numDeElementos - 1);
           ant.setProx(this.inicio);
           this.fim = ant;
           this.numDeElementos--;
       }

    }

    public Celula SEARCH(int pos){
        if (pos < 0){
            pos =  0;
        }
        else if (pos > this.numDeElementos){
            pos = this.numDeElementos;
        }
        Celula atual = this.inicio;
        for (int i = 0; i < pos ; i++){
            atual = atual.getProx();
        }
        return atual;
    }

    public void INSERT(Object info, int pos){
        if (this.numDeElementos == 0){
            this.insereInicio(info);
        }

        else if (pos <= 0){
            this.insereInicio(info);
        }

        else if (pos >= this.numDeElementos){
            this.insereFinal(info);
        }

        else{
            Celula anterior = this.SEARCH(pos - 1);
            Celula nova = new Celula(anterior.getProx(), info);
            anterior.setProx(nova);
            this.numDeElementos++;
        }
    }

    public void DELETE(int pos){
        if (this.numDeElementos == 0){
            System.out.println("A Lista está vazia");
        }

        else if (pos <= 0){
            this.retiraInicio();
        }

        else if(pos >= this.numDeElementos){
            this.retiraFim();
        }

        else{
            Celula atual = this.SEARCH(pos);
            Celula anterior = this.SEARCH(pos - 1);
            anterior.setProx(atual.getProx());
            this.numDeElementos--;
        }
    }

    public void imprimeLista(){
        if (this.numDeElementos == 0){
            System.out.println("A lista está vazia");
        }
        else{
            Celula atual = this.inicio;
            for (int i = 0; i < this.numDeElementos  ; ++i){
                System.out.print(atual.getInfo());
                System.out.printf("\n");
                atual = atual.getProx();
            }
        }

    }
}
