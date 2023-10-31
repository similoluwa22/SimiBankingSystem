import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class BankingSystem {
    private ArrayList<Account> accounts = new ArrayList<>();
    private ArrayList<Transaction> transactions = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();

    public void createAccount(Account account) {
        accounts.add(account);
    }

    public void updateBalance(int accountnumber, double amount) {
        for (Account account : accounts) {
            if (account.getAccountnumber() == accountnumber) {
                account.setBalance(account.getBalance() + amount);
                System.out.println("Balance updated");
                return;
            }
        }
        System.out.println("Account not found.Balance not updated.");
    }

    public void addTransaction(Long accountnumber, double amount, String transactiontype, String transactiondescription) {
        for (Account account : accounts){
            if (account.getAccountnumber() == accountnumber){
                Transaction transaction = new Transaction(transactions.size() + 1, getCurrentDate(), amount, transactiontype, transactiondescription);
                transactions.add(transaction);
                account.setBalance(account.getBalance() + amount);
                System.out.println("Transaction added successfully");
                return;


            }
        }
        System.out.println("Transaction failed because no account was decteded");

    }

  private String getCurrentDate() {
      LocalDate currentDate = LocalDate.now();
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-dd");
      return currentDate.format(formatter);
  }
   public void transaction(Transaction transaction) {
            transactions.add(transaction);
   }
        public ArrayList<Transaction> getTransactionHistory(String accountnumber) {
            ArrayList<Transaction> transactionHistory = new ArrayList<>();
            for (Transaction transaction : transactions) {
                if (transaction.getAccountnumber() == accountnumber){
                    transactionHistory.add(transaction);
                }
            } return transactionHistory;
        }
     public void listAllAccount(){
         for (Account account : accounts) {
             System.out.println("Account name :" + account. getCustomername());
             System.out.println("Account number :" + account.getAccountnumber());
             System.out.println("Account balance :" + account. getBalance());
             System.out.println("Account type :" + account. getAccounttype());
         }

     }
        }