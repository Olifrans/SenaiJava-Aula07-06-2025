public class ContaBancaria {

    private String name;
    public double balance;
    public double interestRate;

    public ContaBancaria() {

    }

    public ContaBancaria(String nome, double balance, double interestRate) {
        this.name = nome;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public ContaBancaria(double balance,String nome,  double interestRate) {
        this.name = nome;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public ContaBancaria(double balance,String nome) {
        this.name = nome;
        this.balance = balance;
        this.interestRate = interestRate;
    }


    public ContaBancaria(String nome, int balance, double interestRate) {
        this.name = nome;
        this.balance = balance;
        this.interestRate = interestRate;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }


    //Retorno nullo
    public void depositoBancario(double valorDeposito){
        balance += valorDeposito;
    }

    public void  saqueBancario(double valorSaque){

        if (valorSaque > balance) {
            System.out.println("Saldo negativo");
        }
        else {
            balance -= valorSaque;
        }
    }


}
