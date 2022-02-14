
public class YourFirstBankTransfer {

    public static void main(String[] args) {
     Account Matthews = new Account("Matthews account",1000);
     Account My_account = new Account("My account",0);
     Matthews.withdrawal(100.0);
     My_account.deposit(100.0);
        System.out.println(Matthews);
        System.out.println(My_account);
    }
}
