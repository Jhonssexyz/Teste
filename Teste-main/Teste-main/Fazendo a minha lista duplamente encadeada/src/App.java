public class App {
    public static void main(String[] args) throws Exception {
        lista lista = new lista();

        lista.insertStart("Janeiro");
        lista.insertStart("Fevereiro");
        lista.insertStart("Março");

        System.out.println(lista.mostrarStart());

        lista.retirarEnd();

        System.out.println(lista.mostrarStart());

    }
}
