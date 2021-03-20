public class Lista {
     private Celula primeiro;
     private Celula ultimo;
     private int TotalDeElementos;

     public void adicionaNoInicio(Object info){
            Celula nova = new Celula(info);
            nova.setProx(this.primeiro);
            this.primeiro = nova;

            if (TotalDeElementos == 0){ // lista vazia(tanto a referencia ultimo como primeiro apontam para nova celula)
                this.ultimo = nova;
            }

            this.TotalDeElementos++;
     }

     public void adicionaNoFim(Object info){
            if (TotalDeElementos == 0){
                this.adicionaNoInicio(info);
            }

            else{
                Celula nova = new Celula(info);
                this.ultimo.setProx(nova);
                this.ultimo = nova;
                this.TotalDeElementos++;
            }
     }

     public void adicionaPos(int pos, Object info){
            if (pos == 0){
                this.adicionaNoInicio(info);
            }

            else if (pos == this.TotalDeElementos){
                this.adicionaNoFim(info);
            }

            else {
                Celula anterior = this.pega((pos - 1));
                Celula nova = new Celula(anterior.getProx(), info);
                anterior.setProx(nova);
                this.TotalDeElementos++;
            }
     }

     public void removeDoInicio(){
            this.primeiro = this.primeiro.getProx();
            this.TotalDeElementos--;

            if (this.TotalDeElementos == 0){
                this.ultimo = null; //lista vazia, tirar a referencia do ponteiro fim do elemento da lista
            }
     }

     public void removeDoFinal(){
            if (this.TotalDeElementos == 1){
                this.removeDoInicio();
            }

            else{
                Celula penultima = pega(this.TotalDeElementos - 1);
                penultima.setProx(null);
                this.ultimo = penultima;
                this.TotalDeElementos--;
            }
     }

     public void removePosicao(int pos){
            if (pos == 0){
                this.removeDoInicio();
            }

            else if (pos == this.TotalDeElementos - 1){
                this.removeDoFinal();
            }

            else{
                Celula anterior = this.pega(pos - 1);
                Celula atual = this.pega(pos);
                anterior.setProx(atual.getProx());
                this.TotalDeElementos--;
            }
     }

     private Celula pega(int pos){

         Celula atual = this.primeiro;
         for (int i = 0; i < pos  ; ++i) {
             atual = atual.getProx();
         }

         return atual;
     }

     public int tamanho(){
         return this.TotalDeElementos;
     }

     public void imprimeLista(){
        if (this.TotalDeElementos == 0){
            System.out.println("A lista está vazia");
        }
        else{
            Celula atual = this.primeiro;
            for (int i = 0; i < this.TotalDeElementos; ++i){
                System.out.print(atual.getInfo());
                System.out.printf("\n");
                atual = atual.getProx();
            }
        }

     }

     public Lista concatena(Lista lista){
         Lista resultado = new Lista();
         int l1 = this.tamanho();
         int l2 = lista.tamanho();
         Celula ptrTrab = this.primeiro;
         for (int i = 0; i < l1; ++i){
             resultado.adicionaNoFim(ptrTrab.getInfo());
             ptrTrab = ptrTrab.getProx();
         }
         ptrTrab = lista.primeiro;
         for (int i = 0; i < l2;++i){
             resultado.adicionaNoFim(ptrTrab.getInfo());
             ptrTrab= ptrTrab.getProx();
         }
         return resultado;
     }

     public void inverteLista(){

         int total = this.TotalDeElementos;
         for(int i = 0; i < total; ++i){
             this.adicionaPos(i, this.ultimo.getInfo());
             this.removeDoFinal();
         }
         this.removeDoInicio();
     }


}
