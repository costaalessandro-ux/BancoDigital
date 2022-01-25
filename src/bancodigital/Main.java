
package bancodigital;

public class Main {

    
    public static void main(String[] args) {
        Banco b = new Banco();
        Cliente cliente = new Cliente();
        cliente.setNome("Alessandro");
        
        Conta cc = new contaCorrente(cliente);
        Conta cp = new contaPoupanca(cliente);
        
        cc.depositar(100);
        cp.depositar(100);
        
        cc.transferir(100, cp);
        cp.transferir(100, cc);
        
        cc.sacar(100);
        
        cc.imprimirExtrato();
        System.out.println(" ");
        System.out.println("---------");
        System.out.println(" ");
        cp.imprimirExtrato();
    }
    
}
