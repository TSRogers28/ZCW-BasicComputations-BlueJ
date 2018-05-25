 


public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
             int one = integers[0] > integers[1] ? integers[0] : integers[1];
             int two = one > integers[2] ? one : integers[2];
             System.out.println(two);
             return two;
    }
         
    

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        
        
        return Math.max(integers[0],Math.max(integers[1],integers[2]));
    }
}
