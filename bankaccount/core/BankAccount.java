package bankaccount.core;

public class BankAccount {
    
        public String accountName;
        public String accountNumber;
        public float initialBalance;
        public float newBalance;
        public float deposit;
        public String [] transactions;
        public Boolean isClosed;
        public long creatingDate;
        public long closingDate;

    // Methods: Get Method Set Method (Getters and Setters) hide the properties
    // within the method

        //public BankAccount{}


        public String setaccountName (String n){
            return this.accountName = n;
        }

        public String getaccountName () {
            return this.accountName;
        }

        public float setaccountBalance (float b){
            return this.initialBalance = b;
           
        }

        public float getaccountBalance () {
            return this.initialBalance;
        }

        public float setaccountBalanceIn (float moneyIn){ 
            this.newBalance = this.initialBalance + moneyIn;
            return moneyIn = this.deposit;
        }

        public float getaccountBalanceIn () {
            return this.deposit; 
        }

        public float setaccountBalanceOut (float moneyOut){
            return moneyOut;
            // this.newBalance = this.initialBalance - moneyOut;
        }

        public float getaccountBalanceOut (float moneyOut){
            return moneyOut;
            // this.newBalance = this.initialBalance + moneyOut;
            // return this.newBalance - this.initialBalance ; 
        }

        // public String setTransactionIn (String receive) {
        //     return
        //     this.transactions.add(receive);
        // }

        // public String setTransactionIn (String receive) {
        //     return
        //     this.transactions = this.transactions + receive;
        // }

        
        
    

}
