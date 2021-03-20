public class Testa{
    public static void main(String[] args) {
        Lista teste = new Lista();
        for (int i = 0; i < 10; i ++){
            teste.adicionaNoFim(i);
        }
        teste.imprimeLista();
        System.out.println("----------------------------");
        teste.inverteLista();
        teste.imprimeLista();

    }
}
