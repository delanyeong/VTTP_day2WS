package bankaccount.core;

import java.text.SimpleDateFormat;  
import java.util.Date;  

public class Main {
    
    public static void main( String [] args ) {

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
        Date date = new Date();  

        BankAccount user1BA = new BankAccount();
        user1BA.setaccountName("user1");
        user1BA.setaccountBalance(0);
        user1BA.setaccountBalanceIn(100);

        BankAccount user2BA = new BankAccount();
        user2BA.setaccountName("user2");
        user2BA.setaccountBalance(0);

        System.out.printf("Account name is %s and balance is %f\n", user1BA.getaccountName(), user1BA.getaccountBalance());

        System.out.printf("Account name is %s and balance is %f\n", user2BA.getaccountName(), user2BA.getaccountBalance());

        System.out.printf("deposit %f at " + formatter.format(date), user1BA.getaccountBalanceIn());











        
    }
}
