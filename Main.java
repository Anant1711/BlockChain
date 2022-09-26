import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Block> BlockChain = new ArrayList<>();
        Transactions t1 = new Transactions("Anant", "Purvi", "1000");
        Transactions t2 = new Transactions("Purvi", "Anant", "150");

        Block block1 = new Block(Arrays.asList(t1), "0");
        BlockChain.add(block1);
        Block block2 = new Block(Arrays.asList(t2), Integer.toString(BlockChain.get(BlockChain.size()-1).hashCode()));
        BlockChain.add(block2);

        System.out.print("Enter your Name: ");
        String from=s.nextLine();
        System.out.print("Enter Sender's Name: "); 
        String To = s.nextLine();
        System.out.print("Enter Amount: ");
        String amount = s.next();

        Transactions transtemp = new Transactions(from, To, amount);
        Block blocktemp = new Block(Arrays.asList(transtemp), Integer.toString(BlockChain.get(BlockChain.size()-1).hashCode()));
        BlockChain.add(blocktemp);
        System.out.println("####################################");
        System.out.println(block1+" Block Hash: "+block1.hashCode());
        System.out.println(block2+" Block Hash: "+block2.hashCode());
        System.out.println(blocktemp+" Block Hash: "+blocktemp.hashCode());
        System.out.println("####################################");
        
    }

       
}
