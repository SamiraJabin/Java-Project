import java.util.ArrayList;
import java.util.List;

public class ATM {
    private String atmId;
    private Location location;
    private CurrencyComposition composition;
    private long balance;
    private Condition condition;
    private List<Transaction> transactionList = new ArrayList<>();

    public ATM(String atmId, Location location, CurrencyComposition cComposition){
        this.atmId = atmId;
        this.location = location;
        this.composition = cComposition;
        condition = Condition.WORKING;
        this.balance = getBalance(composition);
    }

    private long getBalance(CurrencyComposition composition){
        return composition.getFiveHundredNote()*500 + composition.getTwoHundredNote()*200 +
        composition.getOneHundredNote()*100 + composition.getFiftyNote()*50 + 
        composition.getTenNote()*10;
    }

    public String getAtmId(){
        return this.atmId;
    }
    public Location getLocation(){
        return this.location;
    }
    public long getBalance(){
        return this.balance;
    }
    public Condition getCondition(){
        return this.condition;
    }

    public CurrencyComposition getCurrencyComposition(){
        return this.composition;
    }

    public void setLocation(Location location){
        this.location = location;
    }
    public void setCurrencyComposition(CurrencyComposition composition){
        this.composition = composition;
    }

    public List<Transaction> getTransactions(){
        return this.transactionList;
    }
}
