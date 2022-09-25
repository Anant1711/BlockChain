import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Transactions t1 = new Transactions("Anant", "Purvi", 100);
        Block block1 = new Block(Arrays.asList(t1), 0);
        System.out.print(t1.hashCode());
    }   
}
