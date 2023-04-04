package ficha04.pkg1;

import java.util.Scanner;

public class Executavel01 {
    
    public static void main(String[]args){
        
    Banco bc1 = new Banco();
    ContaCorrente cc1 = new ContaCorrente();   
    ContaPoupanca cp1 = new ContaPoupanca();
       
                    System.out.println("-----Menu-----");
                    System.out.println("1.contaPoupanca");
                    System.out.println("2.ContaCorrente");
    
    Scanner x = new Scanner (System.in);
    int escolha = x.nextInt();
    
    switch (escolha){
        case 1:
            
                   
                    System.out.println("Criando conta");
                    System.out.println("Insira o numero da Conta");
                    int escolhas = x.nextInt();
                    bc1.inserir(escolhas);
                    bc1.mostrarDados();
                    
            }
                              
       /* case 2:   
        switch(escolha){
                case 1: 
                    System.out.println("Criando conta");
                    System.out.println("-----Numero da Conta-----");
                    bc1.inserir(escolha);
                        case 2:
                        System.out.println("Selecionar");
                        bc1.procurarConta(escolha);
        case 3:
        System.out.println("Remover Conta");
        bc1.remover(escolha);
        bc1.mostrarDados();   
            }
        }  */          
    }  
}
