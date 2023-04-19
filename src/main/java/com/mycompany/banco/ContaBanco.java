
package com.mycompany.banco;

public class ContaBanco {
    public int numConta;
    protected  String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("Numero da conta " + this.getNumConta());
        System.out.println("Tipo da conta " + this.getTipo());
        System.out.println("Dono da conta " + this.getDono());
        System.out.println("Saldo da conta " + this.getSaldo());
        System.out.println("Status da conta " + this.getStatus());
    }
    
    public ContaBanco(){
        this.setStatus(false);
        this.setSaldo(0);
    }    
    
    public void setNumConta(int numConta){
        this.numConta=numConta;
    }
    
    public int getNumConta(){
        return this.numConta;
    }
    
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setDono(String dono){
        this.dono=dono;
    }
    
    public String getDono(){
        return this.dono;
    }
    
    public void setSaldo(float saldo){
        if (saldo>0) {
            this.saldo=saldo;
        } else {
            System.out.println("Valor negativo não pode ser depositado");
        }
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    
    public void setStatus(boolean status){
        this.status=status;
    }
    
    public boolean getStatus(){
        return this.status;
    }
    



    
    public void abrirConta(String t){
if (this.getStatus() == false) {
    if (t=="CC"||t=="CP"){
        this.setStatus(true);
        this.setTipo(t);
         if (this.getTipo()=="CC") {
             this.setSaldo(50);
             System.out.println("Conta Corrente aberta");
         } else if (this.getTipo()=="CP"){
             this.setSaldo(150);
             System.out.println("Conta Poupança aberta");
     }
 }  System.out.println("Tipo de conta invalida");
}   System.out.println("Conta já está aberta");
}

    public void fechaConta(){
        if (this.getStatus() == true && this.saldo > 0){
            System.out.println("Conta não pode ser fechada, porque tem saldo");
        }else if (this.getStatus() == true && this.saldo<0){
            System.out.println("Conta não pode ser fechada, porque está com divida");
        }else if (this.getStatus() == false){
            System.out.println("Conta já está fechada");
        }else 
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
    }

    public void depositar(float valor){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo()+valor);
            System.out.println("Valor depositado");
    }else 
    System.out.println("Conta fechada");
    }

    public void sacar(float valor){
        if (this.getStatus()){
        if(this.getSaldo()<valor){
            System.out.println("Valor de saque maior que o do saldo");
        }else
            this.setSaldo(this.getSaldo()-valor);
            System.out.println("Valor sacado com sucesso");
    }else
    System.out.println("Conta está fechada");
}
    
    
    
    public void pagarMensalidade(){
        if (this.getStatus()){
        if (this.getTipo()=="CC"){
            this.setSaldo(this.getSaldo()-12);
            System.out.println("Mensalidade paga");
        }else if (this.getTipo()=="CP"){
            this.setSaldo(this.getSaldo()-20);
            System.out.println("Mensalidade paga");
        }
    }else 
    System.out.println("Conta fechada");
    
}
    

}