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

    public String mostrarStart(){
        No no = inicio;
        String aux = "";

        while(no != null){
            aux += no.mes + " " + index + "\n";
            no = no.proximo;
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
            no.anterior = fim;
            fim.proximo = no;
            fim = no;
        }
    }

        public String mostrarEnd(){
            No no = fim;
            String aux = "";

            while(no != null){
                aux += no.mes + " " + index + "\n";
                no = no.anterior;
            }
            return aux;
        }


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
    


// ----------------------------------------------------------------

public void contador(){
    index = 0;
    No no = inicio;
    while(no != null){
        index++;
        no = no.proximo;
    }


}

public void inserirQQ(String mes, int posicao){
    No no = inicio;

    if(posicao == 1){
        insertStart(mes);
    }
    else{
        No 
    }

}

public void retirarQQ(){
    No no = inicio;

    if(inicio == null){

    }
    else if(inicio == fim){
        inicio = null;
        fim = null;
    }
    else{
        
    }

}

}