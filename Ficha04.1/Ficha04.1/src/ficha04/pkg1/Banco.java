
package ficha04.pkg1;

import java.util.ArrayList;

public class Banco implements Imprimir {

    public Banco() {
    }
   
     ContaCorrente ccc = new ContaCorrente();
      
        ArrayList<ContaCorrente> lista = new ArrayList(); 

    @Override
    public void mostrarDados() {
     
        for(int t = 0; t <= lista.size(); t++){
            System.out.println("Conta: "+ccc.getNumConta());
        }
    }
          
    public void inserir(int escolha) {
     
       lista.add(ccc);
       ccc.setNumConta(escolha);
    }
  
    public void remover(int remover) {
     lista.add(ccc);
      lista.remove(remover);
    }

    public void procurarConta(int numCont) {
        for(int x = 0; x <= lista.size(); x++){
            if(lista.equals(numCont)){
                System.out.println(x);  
            } else{
                System.out.println("Null");
            }    
        }
    } 

    public ContaCorrente getCc() {
        return ccc;
    }

    public void setCc(ContaCorrente cc) {
        this.ccc = cc;
    }

    public ArrayList<ContaCorrente> getLista() {
        return lista;
    }

    public void setLista(ArrayList<ContaCorrente> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Banco{" + "cc=" + ccc + ", lista=" + lista + '}';
    }
    
}
