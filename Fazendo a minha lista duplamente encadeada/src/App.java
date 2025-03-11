public class App {
    public static void main(String[] args) throws Exception {
        lista lista = new lista();

        lista.insertEnd("Janeiro");
        lista.insertEnd("Fevereiro");
        lista.insertEnd("Março");

        lista.mostrarEndA();
      
        lista.retirarEnd();
        lista.retirarEnd();
    
        lista.mostrarEndA();
  
    }
}
