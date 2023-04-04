package ficha04.pkg1;
public abstract class ContaBancaria {
    private int numConta;
    private float saldo;
    private String historico;
    
    public ContaBancaria(){
        
    }

    public ContaBancaria(int numConta, float saldo, String historico) {
        this.numConta = numConta;
        this.saldo = saldo;
        this.historico = historico;
    }

    public abstract void depositar (double valor);
    public abstract void sacar(double valor);
    
    public void tranferir(double valor, ContaBancaria transf){
        if(this.getSaldo() >= valor){
            sacar(valor);
            transf.depositar(valor);
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" + "numConta=" + numConta + ", saldo=" + saldo + ", historico=" + historico + '}';
    }    
}
