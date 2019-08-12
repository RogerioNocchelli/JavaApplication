package javaapplication;

public class ContaBanco {
    private int agencia;
    private int numero;
    private int digito;
    private double saldo;
    
    public void ContaBanco() {
     this.setSaldo(0);
    }
    
    public int getAgencia(){
        return this.agencia;
    }
    
    public void setAgencia(int ag){
        this.agencia = ag;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public void setNumero(int n){
        this.numero = n;
    }
    
    public int getDigito() {
        return this.digito;
    }
    
    public void setDigito(int d) {
        this.digito = d;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(double s) {
        this.saldo = s;
    }
    
    public void Status() {
        System.out.println("=== STATUS DA CONTA ===");
        System.out.println("Agência: " + this.getAgencia());
        System.out.println("Conta: " + this.getNumero() + "-" + this.getDigito());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("=======================");
        
    }
    
    
    
}
