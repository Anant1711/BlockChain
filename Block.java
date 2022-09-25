/**
 * Block
 */
import java.util.List;
public class Block {

    private int previousHash;
    private List<Transactions> l;

    public Block(List<Transactions> t1, int previousHash){
        this.previousHash=previousHash;
        this.l=t1;
    }
    
}