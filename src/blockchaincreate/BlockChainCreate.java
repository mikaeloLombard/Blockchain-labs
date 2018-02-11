
package blockchaincreate;

import java.util.Arrays;


public class BlockChainCreate 
{
    private int previousHash;
    private String[] transactions;

    private int blockHash;
    
    public BlockChainCreate(int previousHash, String[] transactions) {
        this.previousHash = previousHash;
        this.transactions = transactions;
        
        Object[] contens = {Arrays.hashCode(transactions), previousHash};
        this.blockHash = Arrays.hashCode(contens);
    }
      
    public int getPreviousHash() {
        return previousHash;
        
    }
    
    public String[] getTransaction() {
        return transactions;
        
 
    }




    
    public static void main(String[] args) 
    {
        
        
        
        
        
    }
    
}
