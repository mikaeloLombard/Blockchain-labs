
package blockchainbasic;

import java.io.PrintStream;
import java.util.ArrayList;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class BlockChainBasic {

    /**
      Hash = digital signature
          Each block will have:
               -List of transactions
               -Previous hash
              
               -Hash (The hash for this block based on the list of transactions
                and the previous hash)
     
     */
    ArrayList<Block> blockchain = new ArrayList<>();
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) 
    {
        int previousHash = 0;
        
        String[] genesisTransactions = {"satoshi sent Mike 1200 bitcoin", "Loky sent 1047 bitcoin to Mike"};
        Block genesisBlock = new Block(previousHash, genesisTransactions);
        
        String[] block2Transactions = {"satoshi sent 500 bitcoin to McDonalds", "McDonalds sent 314 bitcoin to CowHorse.inc"};
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);
        
        String[] block3Transactions = {"satoshi sent 56 bitcoin to his mom", "Mom sent 3 bitcoin to my sister"};
        Block block3 = new Block(genesisBlock.getBlockHash(), block3Transactions);
        
        System.out.println("Hash of genesis block: ");
        System.out.println(genesisBlock.getBlockHash());
        
        System.out.println("Hash of block 2: ");
        System.out.println(block2.getBlockHash());
        
        System.out.println("Hash of block 3: ");
        System.out.println(block3.getBlockHash());
        
       
       
               
        
        
        
    }
    
}
