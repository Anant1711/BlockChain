/**
 * Block Body in BlockChain
 */
import java.util.List;
public class Block {

    private String previousHash;
    private List<Transactions> l;

    public Block(List<Transactions> t1, String previousHash){
        this.previousHash=previousHash;
        this.l=t1;
    }

    //We override HashCode and equal method because it will not give the same hash everytime we do change in transaction.
    @Override
    public int hashCode() {
        int hash = previousHash!=null ? previousHash.hashCode():0;
        hash = 32*hash + (l!=null ? l.hashCode():0);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Block block = (Block) o;

        if (previousHash != block.previousHash) return false;
        return l != null ? l.equals(block.l) : block.l == null;
    }

    @Override
    public String toString() {
        return "Previous Hash: "+this.previousHash+" "+l;
    }
    
}