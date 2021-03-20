public class FilaComPilha {

    private Celula topo;
    private int totalDeElementos;

    private void insereNaPilha(Object info){
        Celula novo = new Celula(this.topo, info);
        this.topo = novo;
    }

    public  void retira(){
        if (this.totalDeElementos == 0){
            System.out.println("Não foi possível reitrar. A fila está vazia.");
        }

        else{
            this.topo = this.topo.getProx();
            this.totalDeElementos--;
        }
    }

    public void  insere(Object info){
        if (this.totalDeElementos == 0){
            this.insereNaPilha(info);
            this.totalDeElementos++;
        }

        else{
            FilaComPilha aux = new FilaComPilha();
            while (this.topo != null){
                aux.insereNaPilha(this.topo.getInfo());
                aux.totalDeElementos++;
                this.retira();
            }
            this.insereNaPilha(info);
            this.totalDeElementos++;
            while (aux.topo != null){
                this.insereNaPilha(aux.topo.getInfo());
                this.totalDeElementos++;
                aux.retira();
            }
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
            for (int i = 0; i < this.totalDeElementos  && atual != null; ++i){
                System.out.print(atual.getInfo());
                System.out.printf("\n");
                atual = atual.getProx();
            }
        }

    }




}


