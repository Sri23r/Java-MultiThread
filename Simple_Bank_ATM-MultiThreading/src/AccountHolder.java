public class AccountHolder implements Runnable {
    Account account;

    public AccountHolder(Account account){
        this.account=account;
    }

    public void run(){
        for(int i=0;i<4;i++){
            makeWithdrawal(2000);
            if(account.getBalance()<0){
                System.out.println("Account insufficient");
            }
        }
    }

    public synchronized void makeWithdrawal(int withdrawAmount){
        if(account.getBalance()>=withdrawAmount){
            System.out.println(Thread.currentThread().getName()+" is going to withraw "+withdrawAmount);
            try{
                Thread.sleep(2000);
            }
            catch(Exception e){
            }
            account.withdraw(withdrawAmount);
            System.out.println(Thread.currentThread().getName()+" completes a withrawal of "+withdrawAmount);
        }
        else{
            System.out.println("Not Enough amount in account for "+Thread.currentThread().getName()+" to withdraw "+account.getBalance());
        }
    }
}
