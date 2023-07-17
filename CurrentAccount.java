public class CurrentAccount extends Account 
{
    private double overDraftLimit;
    public CurrentAccount() {}
    public CurrentAccount(double overDraftLimit,int accountNo, double balance, String openedDate) 
    {
    	super(accountNo,balance,openedDate);
        this.overDraftLimit = validateoverDraftLimit(overDraftLimit);
    }
    private double validateoverDraftLimit(double overDraftLimit2) 
    {
        if(overDraftLimit<100000)
            return overDraftLimit;
        throw new RuntimeException("limit is only one lakh");
    }
    public double getOverDraftLimit() {
        return overDraftLimit;
    }
    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = validateoverDraftLimit(overDraftLimit);
    }


}