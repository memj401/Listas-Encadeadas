public class Fila {
    private Celula inicio;
    private Celula fim;
    private int totalDeElementos;

    public void coloca(Object info){

        if (totalDeElementos == 0){
            Celula nova = new Celula(this.inicio, info);
            inicio = nova;
            fim = nova;
            this.totalDeElementos++;
        }

        else{
            Celula nova = new Celula(info);
            this.fim.setProx(nova);
            this.fim = nova;
            this.totalDeElementos++;
        }
    }

    public void tira(){
        if (totalDeElementos == 0){
            System.out.println("Não foi possível reitrar. A fila está vazia.");
        }

        else{
            this.inicio = this.inicio.getProx();
            this.totalDeElementos--;
            if (this.totalDeElementos == 0){
                this.fim = null;
            }
        }
    }

    public int getTotalDeElementos(){
        return totalDeElementos;
    }
}
