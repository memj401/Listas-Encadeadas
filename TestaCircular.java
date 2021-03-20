import java.util.*;

public class TestaCircular {
    public static void main(String[] args) {
        ListaCircular teste = new ListaCircular();
        teste.INSERT("Marcos",2);
        teste.INSERT(2,0);
        teste.INSERT('c', 2);
        teste.imprimeLista();
        System.out.println("-----------------------1");
        Celula testa = teste.SEARCH(1);
        System.out.println(testa.getInfo());
        System.out.println("-----------------------2");
        teste.DELETE(0);
        teste.DELETE(1);
        teste.DELETE(3);
        teste.imprimeLista();
        System.out.println("-----------------------3");
        teste.INSERT(5,0);
        teste.INSERT("ola mundo",2);
        teste.imprimeLista();
        System.out.println("-----------------------4");
        teste.DELETE(1);
        teste.imprimeLista();

    }
}


