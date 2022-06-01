package bankaccount.core;

public class Main {
    
    public static void main( String [] args ) {

        BankAccount user1BA = new BankAccount();
        user1BA.setaccountName("user1");
        user1BA.setaccountBalance(0);

        BankAccount user2BA = new BankAccount();
        user2BA.setaccountName("user2");
        user2BA.setaccountBalance(0);

        System.out.printf("Account name is %s and balance is %f\n", user1BA.getaccountName(), user1BA.getaccountBalance());

        System.out.printf("Account name is %s and balance is %f\n", user2BA.getaccountName(), user2BA.getaccountBalance());









        
    }
}
