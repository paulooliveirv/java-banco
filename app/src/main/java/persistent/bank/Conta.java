package persistent.bank;



public class Conta {
    private double saldo = 50.00;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double valor){
        if (valor < 0) {
            System.out.println("Não é possível depoistar valor abaixo de R$1,00");
        }else{
        saldo = saldo + valor;
        }
    }


}
