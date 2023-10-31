public class Transaction {
    private String accountnumber;
    private String transactionid;
    private String transactiondate;
    private Long transactionamount;
    private String transactiontype;
    private String transactiondesciption;


    public Transaction( String accountnumber, String transactionid,String transactiondate,Long transactionamount,String transactiondesciption){}

    public Transaction(int i, String currentDate, double amount, String transactiontype, String transactiondescription) {
    }

    public String getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid;
    }

    public String getTransactiondate() {
        return transactiondate;
    }

    public void setTransactiondate(String transactiondate) {
        this.transactiondate = transactiondate;
    }

    public Long getTransactionamount() {
        return transactionamount;
    }

    public void setTransactionamount(Long transactionamount) {
        this.transactionamount = transactionamount;
    }

    public String getTransactiontype() {
        return transactiontype;
    }

    public void setTransactiontype(String transactiontype) {
        this.transactiontype = transactiontype;
    }

    public String getTransactiondesciption() {
        return transactiondesciption;
    }

    public void setTransactiondesciption(String transactiondesciption) {
        this.transactiondesciption = transactiondesciption;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }
}
