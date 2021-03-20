public class Celula {
    private Celula prox;
    private Celula ant;
    private Object info;


    public Celula(Celula proxima, Object info){
        this.prox = proxima;
        this.info = info;
    }

    public Celula (Object info){
        this.info = info;
    }

    public  void setProx(Celula proxima){
        this.prox = proxima;
    }

    public Celula getProx(){
        return this.prox;
    }

    public Object getInfo(){
        return this.info;
    }

    public Celula getAnt(){
        return this.ant;
    }

    public void setAnt(Celula ant) {
        this.ant = ant;
    }
}

