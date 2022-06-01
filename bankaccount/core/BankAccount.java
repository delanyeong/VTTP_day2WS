package bankaccount.core;



public class BankAccount {
    
        public String accountName;
        public String accountNumber;
        public float accountBalance;
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
            return this.accountBalance = b;
           
        }

        public float getaccountBalance () {
            return this.accountBalance;
        }

        public float setaccountBalanceIn (float moneyIn){ 
            if(moneyIn < 0)
            System.out.println("not valid");
            else 
            return this.accountBalance = this.accountBalance + moneyIn;
        }

        public float getaccountBalanceIn (float moneyIn) {
            return moneyIn; 
        }

        public float setaccountBalanceOut (float moneyOut){
            return 
            this.accountBalance = this.accountBalance - moneyOut;
        }

        public float getaccountBalanceOut (float moneyOut){
            return 
            this.accountBalance = this.accountBalance - moneyOut;
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
