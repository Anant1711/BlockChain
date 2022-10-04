//Main file 
import java.util.Scanner;
import java.util.Arrays;
import java.sql.*;

import BlockChain_components.Block;
import BlockChain_components.Transactions;
import DB.database;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Scanner s = new Scanner(System.in);
        database d = new database();

//        BlockChain_components.Transactions t1 = new BlockChain_components.Transactions("Anant", "Purvi", "1000");
//        BlockChain_components.Transactions t2 = new BlockChain_components.Transactions("Purvi", "Anant", "150");
//        BlockChain_components.Block genesis = new BlockChain_components.Block(Arrays.asList(t1), "00000000");

        System.out.print("Enter your Name: ");
        String from=s.nextLine();
        System.out.print("Enter Sender's Name: ");
        String To = s.nextLine();
        System.out.print("Enter Amount: ");
        String amount = s.next();

        Transactions transtemp = new Transactions(from, To, amount);
        Block blocktemp = new Block(Arrays.asList(transtemp), d.prevhash());
        database db = new database(blocktemp.getPrevhash(),blocktemp.getTransDet().toString(),Integer.toString(blocktemp.hashCode()));

        db.insert();
        db.print();

    }
}
