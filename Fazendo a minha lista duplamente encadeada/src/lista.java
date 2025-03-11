import Elos.*;
public class lista {

    No inicio = null;
    No fim = null;
    int index = 0;

    public void insertStart(String mes){
        No no = new No();
        no.mes = mes;
        if(inicio == null){
            no.proximo = null;
            no.anterior = null;
            inicio = no;
            fim = inicio;
        }
        else{
            no.proximo = inicio;
            inicio.anterior = no;
            inicio = no;
        }
    }

    public String mostrarInicioP(){
        No no = inicio;

        String aux = "";
        while(no != null){
            aux += no.mes + "\n";
            no = no.proximo;
        }
        return aux;
    }

    public String mostrarInicioA(){
        No no = fim;

        String aux = "";
        while(no != null){
            aux += no.mes + "\n";
            no = no.anterior;
        }
        return aux;
    }

    public void retirarStart(){
      if(inicio == null){

      }
      else if(inicio == fim){
        inicio = null;
        fim = null;
      }
      else{
        inicio = inicio.proximo;
        inicio.anterior = null;
      }

      
    }

// ----------------------------------------------------------------------

    public void insertEnd(String mes){
        No no = new No();
        no.mes = mes;
        if(fim == null){
            no.anterior = null;
            no.proximo = null;
            fim = no;
            inicio = fim;
        }
        else{
            fim.proximo = no;
            no.anterior = fim;
            fim = no;
        }
    }

        public void mostrarEndA(){
            No no = fim;

            while(no != null){
                System.out.println(no.mes);
                no = no.anterior;
            }
        }

        // public void mostrarEndP(){
        //     No no = fim;

        //     while(no != null){
        //         System.out.println(no.mes);
        //         no = no.proximo;
        //     }
        // }

        public void retirarEnd(){
            
            if(fim == null){

            }
            else if(inicio == null){
                inicio = null;
                fim = null;
            }
            else{
               fim = fim.anterior;
               fim.proximo = null;
            }
        }
    
}

