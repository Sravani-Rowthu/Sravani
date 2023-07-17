public class Account 
{
    private int accountNo;
    private double balance;
    private String openedDate;
    public Account() {}
    public Account(int accountNo, double balance, String openedDate) 
    {
        this.accountNo = accountNo;
        this.balance = balance;
        this.openedDate = openedDate;
    }
    public int getAccountNo() 
    {
        return accountNo;
    }
    public void setAccountNo(int accountNo) 
    {
        this.accountNo = accountNo;
    }
    public double getBalance() 
    {
        return balance;
    }
    public void setBalance(double balance) 
    {
        this.balance = balance;
    }
    public String getOpenedDate() 
    {
        return openedDate;
    }
    public void setOpenedDate(String openedDate) 
    {
        this.openedDate = openedDate;
    }

}
