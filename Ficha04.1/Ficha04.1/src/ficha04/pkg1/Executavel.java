package ficha04.pkg1;

import java.util.ArrayList;

public class Executavel {
    
    public static void main(String[] args){
        
     ContaCorrente cc = new ContaCorrente(123456789,500f, "28/03/2023");  
     cc.mostrarDados();
     cc.depositar(2000f);
     
        System.out.println("");
     
     ContaPoupanca cp = new ContaPoupanca(1213425364,500f,"28/03/2023");
     cp.mostrarDados();
     cp.depositar(2000);
     cp.sacar(3000);
     
     ArrayList<ContaPoupanca> lista = new ArrayList();
     lista.add(cp);
    }
}
