package ficha04.pkg1;

public class ContaPoupanca extends ContaBancaria implements Imprimir {
    private int limite;
    
    public ContaPoupanca(){
    }    
    
    public ContaPoupanca(int numConta, float Saldo, String historico) {
        super(numConta, Saldo, historico);
    }

    public ContaPoupanca(int limite, int numConta, float Saldo, String historico) {
        super(numConta, Saldo, historico);
        this.limite = limite;
    }
    
      @Override
    public void mostrarDados() {
         System.out.println("---Conta Poupanca---");
         System.out.println("N.Conta: "+this.getNumConta());
         System.out.println("Saldo: "+this.getSaldo());
         System.out.println("Historico: "+this.getHistorico());
    }
    
    
    @Override
    public void depositar(double valor) {
        if(valor > 100){
            this.setSaldo((float) ((this.getSaldo()) + valor));
            
            System.out.println("Deposito "+valor+" efectuado co sucesso na conta "+this.getNumConta());    
        } else {
            System.out.println("Impossivel depositar na conta "+this.getNumConta()+
                "\t So e possivel depositar acima de 100");
        }       
    }

    @Override
    public void sacar(double valor) {
         if((this.getSaldo() >= valor)){
            this.setSaldo((float) ((this.getSaldo() - valor)));
              
                System.out.println("Saque "+valor+" efectudo com sucesso na conta "+this.getNumConta()); 
                
        }else if(this.getSaldo() < valor){
        
                      this.setSaldo(this.getSaldo() + this.getLimite());
                      System.out.println("Saque efectuado com sucesso na conta "+this.getNumConta());
                      System.out.println("Credito de padrao de 5000 Mt foi adicionado, para o saque sucessivo");
                      
        }else{
             System.out.println("Impossivel efectuar o saque na conta "+this.getNumConta()
             +"\nPorque o saldo e insuficiente");
        }
    }

    public void setLimite(int limite) {
        this.limite = 5000;
    }
    
    public int getLimite() {
        return limite;
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" + "limite=" + limite + '}';
    }
}
