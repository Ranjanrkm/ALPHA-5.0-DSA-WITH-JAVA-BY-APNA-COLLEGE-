public class Bank {
   public static void main(String args[]) {
    BankAccount myAcc = new BankAccount();
    myAcc.username = "ranjankumarmahato";
    myAcc.setPassword("rkm");
    }
    
}


class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}




