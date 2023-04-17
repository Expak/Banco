
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
    
    public String setSaldo(float saldo){
        if (saldo>0) {
            this.saldo=saldo;
        } else {
            return "Valor negativo não pode ser depositado";
        }
        return null;

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
    
    
    
    
    
    
    
    
    public String abrirConta(String t){
        if (this.getStatus() == false){
           this.setStatus(true);
           this.setTipo(t);
            if (t=="CC") {
                this.setSaldo(50);
            } else if (t=="CP"){
                this.setSaldo(150);
            }
           return "Conta foi aberta com sucesso";
        }else 
            return "Conta já está aberta";
    }
    public String fechaConta(){
        if (this.getStatus() == true && this.saldo > 0){
            return "Conta não pode ser fechada, porque tem saldo";
        }else if (this.getStatus() == true && this.saldo<0){
            return "Conta não pode ser fechada, porque está com divida";
        }else if (this.getStatus() == false){
            return "Conta já está fechada";
        }else 
            this.setStatus(false);
        return "Conta fechada com sucesso";
    }
    public String depositar(float valor){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo()+valor);
        return "Valor depositado";
    }else 
            return "Conta fechada";
    }
    public String sacar(float valor){
        if (this.getStatus()){
        if(this.getSaldo()<valor){
            return "Valor de saque maior que o do saldo";
        }else
            this.setSaldo(this.getSaldo()-valor);
        return "Valor sacado com sucesso";
    }else
            return "Conta está fechada";
}
    
    
    
    public String pagarMensalidade(){
        if (this.getStatus()){
        if (this.getTipo()=="CC"){
            this.setSaldo(this.getSaldo()-12);
        return "Mensalidade paga";
        }else if (this.getTipo()=="CP"){
            this.setSaldo(this.getSaldo()-20);
        return "mensalidade paga";
        }
        return null;
    }else 
            return "Conta fechada";
    
}
    

}