public class TestaLista {
    public static void main(String[] args) {
        Lista teste = new Lista();
        teste.adicionaNoInicio("Marcos");
        teste.adicionaNoFim("Monteiro");
        teste.adicionaPos(1,"Eduardo");
        teste.adicionaNoInicio("Ola");
        teste.imprimeLista();
        System.out.println("----------------------------");
        System.out.print(teste.tamanho());
        System.out.printf("\n");
       teste.removePosicao(1);
        System.out.println("----------------------------");
       teste.imprimeLista();

    }
}
