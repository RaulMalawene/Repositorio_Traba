package ficha04.pkg1;

public class ContaCorrente extends ContaBancaria implements Imprimir {
    private float taxaDOper = 10;

    public ContaCorrente(int numConta, float Saldo, String historico) {
        super(numConta, Saldo, historico);
    }

   public ContaCorrente(){     
   }
   
     @Override
    public void mostrarDados() {
         System.out.println("---Conta Corrente---");
         System.out.println("N.Conta: "+this.getNumConta());
         System.out.println("Saldo: "+this.getSaldo());
         System.out.println("Historico: "+this.getHistorico());
    }
 
     @Override
    public void depositar(double valor) {
        if(valor > 100){
            this.setSaldo((float) ((this.getSaldo() - this.getTaxaDOper()) + valor));
            
            System.out.println("Deposito "+valor+" efectuado co sucesso na conta "+this.getNumConta());  
           // System.out.println("Com taxa de "+this.getTaxaDOper());
        } else {
                System.out.println("Impossivel depositar na conta "+this.getNumConta());
                System.out.println("So e possivel depositar acima de 100");
        }
    }
    
    @Override
    public void sacar(double valor) {
         if((this.getSaldo() >= valor)){
            this.setSaldo((float) ((this.getSaldo() - valor) - this.getTaxaDOper()));
            
            if(this.getSaldo() >= this.getTaxaDOper()){
                System.out.println("Saque "+valor+" efectudo com sucesso na conta "+this.getNumConta());   
            }
        }else{
             System.out.println("Impossivel efectuar o saque na conta "+this.getNumConta()
             +"\nPorque o saldo e insuficiente");
        }
    }

    public float getTaxaDOper() {
        return taxaDOper;
    }

    public void setTaxaDOper(float taxaDOper) {
        this.taxaDOper = taxaDOper;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" + "taxaDOper=" + taxaDOper + '}';
    }  
}
