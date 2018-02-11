
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
        
        String[] genesisTransactions = {"satoshi sent Mike 100 bitcoin", "Loky sent 104 bitcoin to Mike"};
        Block genesisBlock = new Block(previousHash, genesisTransactions);
        
        
        System.out.println(genesisBlock.getBlockHash());
        
       
       
               
        
        
        
    }
    
}
