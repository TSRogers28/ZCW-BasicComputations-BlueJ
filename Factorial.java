 


import java.math.BigInteger;

public class Factorial {

    public BigInteger factorialOf(Integer value){
        long result = 1;
        for(long x = 2; x <= value; x++){
        result *= x;
        
        }
        return BigInteger.valueOf(result);
    }

}
