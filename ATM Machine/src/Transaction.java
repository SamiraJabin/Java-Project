import java.time.LocalDateTime;

public class Transaction {
    private long transactionId;
    private LocalDateTime dateOfTransaction;
    private int transactionAmount;
    private Verdict verdict;
    private TransactionType transactionType;
    private Location location;

    public Transaction(long transactionId,
    LocalDateTime dateOfTransaction,
    int transactionAmount,
    Verdict verdict,
    TransactionType transactionType,
    Location location){
        this.transactionId = transactionId;
        this.dateOfTransaction = dateOfTransaction;
        this.transactionAmount = transactionAmount;
        this.verdict = verdict;
        this.transactionType = transactionType;
        this.location = location;
    }

    public long getTransactionId(){
        return this.transactionId;
    }

    public LocalDateTime getDateOfTransaction(){
        return this.dateOfTransaction;
    }
    public int getTransactionAmount(){
        return this.transactionAmount;
    }

    public Verdict getVerdict(){
        return this.verdict;
    }

    public TransactionType getTransactionType(){
        return this.transactionType;
    }

    public Location getLocation(){
        return this.location;
    }
}
