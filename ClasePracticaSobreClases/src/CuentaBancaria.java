public class CuentaBancaria {
    private int numAccount; //numero de cuenta
    private double credit; //balance
    private String username; //nombre del cliente
    private String email; //correo
    private int phoneNumber; //

    public CuentaBancaria(){

    }

    public CuentaBancaria(int numAccount, double credit, String username, String email, int phoneNumber){
        this.numAccount=numAccount;
        this.credit=credit;
        this.username=username;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }

    public int getNumAccount(){
        return this.numAccount;
    }
    public double getCredit(){
        return this.credit;
    }
    public String getUserName(){
        return this.username;
    }
    public String getEmail(){
        return this.email;
    }
    public int getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setNumAccout(int numAccount){
        this.numAccount=numAccount;
    }
    public void setCredit(int credit){
        this.credit=credit;
    }
    public void setUserName(String username){
        this.username=username;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    
    public double DepositarFondos(double depofondo){
        credit = 0;
        credit += depofondo;
        return credit;
    }
    public void RetirarFondo(double retifondo, double newCredit){
        if (newCredit == 0) {
            System.out.println("No se puede retirar dinero, porque no hay fondos");
        } else {
            newCredit -= retifondo;
            System.out.println(newCredit);
        }
        
    }
}
