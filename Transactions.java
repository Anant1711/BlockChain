
public class Transactions {
    private String source;
    private String destination;
    private long Money;

    Transactions(String s, String d, long m){
        this.Money = m;
        this.source=s;
        this.destination=d;
    }

    public String getSource(){return this.source;}
    public void setSource(String s){this.source=s;}
    public String getDest(){return this.destination;}

    
}
