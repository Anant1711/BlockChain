//Transactions body in Blockchain
public class Transactions {
    private String source;
    private String destination;
    private String Money;

    Transactions(String s, String d, String m){
        this.Money = m;
        this.source=s;
        this.destination=d;
    }

    @Override
    public int hashCode() {
        int hash = source!=null ? source.hashCode() : 0;
        hash = 31*hash+(destination!=null ? destination.hashCode() : 0);
        hash = 31*hash+(Money!=null ? Money.hashCode():0);

        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Transactions that = (Transactions) o;

        if (source != null ? !source.equals(that.source) : that.source != null) return false;
        if (destination != null ? !destination.equals(that.destination) : that.destination != null)
            {return false;}
        
        if(Money!=null){return Money.equals(Money);
        }else{
            return Money==null;
        }
    }
    @Override
    public String toString() {
        return "Source: "+this.source+", Destination: "+this.destination+", Amount: "+this.Money;
    }
    
}
