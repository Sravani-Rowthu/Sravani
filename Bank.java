public class Bank
{
    SavingAccount s=new SavingAccount();
    private int index=0;
    private String bankName;
    private String branchName;
    private Account[] accounts;
    public Bank() {}
    public Bank(String bankName, String branchName,Account[] accounts) 
    {
        this.bankName = bankName;
        this.branchName = branchName;
        this.accounts=accounts;
    }
    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public String getBranchName() {
        return branchName;
    }
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
    public boolean addAccount(Account account)
    {
        if(index<accounts.length)
        {
            accounts[index++]=account;
            return true;
        }
        throw new RuntimeException("No more accounts can be added");
    }
    public void showAccounts()
    {
        System.out.println("........" +getBankName() + "..........." );
        for(int i=0;i<index;i++)
        {
            System.out.println("account number: " + accounts[i].getAccountNo());
            System.out.println("account opened date: " + accounts[i].getOpenedDate());
            System.out.println("balance amount: " + accounts[i].getBalance());
            System.out.println("..................");
        }
    }
    public boolean transaction(char ttype,int accountNo,double amount)
    {
        for(int i=0;i<index;i++)
        {
            if(ttype=='w')
            {
                if(accounts[i].getAccountNo()==accountNo)
                {
                    if(accounts[i].getBalance()>=s.getMinimumDepositAmount())
                    {
                        double b=accounts[i].getBalance()-amount;
                        System.out.println("account number: " + accounts[i].getAccountNo());
                        System.out.println("Remaining balance: " + b);
                        accounts[i].setBalance(b);
                        return true;
                    }
                    throw new RuntimeException("Insufficient balance");
                }
            }
            else
            {
                if(accounts[i].getAccountNo()==accountNo)
                {
                    double depamount=accounts[i].getBalance()+amount;
                    System.out.println("account number: " + accounts[i].getAccountNo());
                    System.out.println("Total balance: " + depamount+" ");
                    return true;
                }
            }
        }
        return false;        
    }

}