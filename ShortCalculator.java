// Write a program that reads in two numbers between 0 and 65535, 
//stores them in short variables, and computes their unsigned sum, 
//difference, product, quotient, and remainder , without converting 
//them to int.

import java.util.*;

public class ShortCalculator {
    short f;
    short s;
    public ShortCalculator(){
        short first = f;
        short second = s;
    }    

    public static void main(String[] args){
        Scanner shortNum = new Scanner(System.in);
        System.out.println("Enter first short");
        short f = shortNum.nextShort();
        System.out.println("Enter second short");
        short s = shortNum.nextShort();
        ShortCalculator shortCalc = new ShortCalculator();
        shortCalc.getSum(f, s);
        shortCalc.getDifference(f, s);
        shortCalc.getProduct(f, s);
        shortCalc.getQuotient(f, s);
        shortCalc.getRemainder(f, s);
    }

    public short getSum(short first,short second){
        short sum = (short)(first + second);
        System.out.println("sum is "+ sum);
        return sum;
    }

    public short getDifference(short first,short second){
        short difference = (short)(first - second);
        System.out.println("differece is "+ difference);
        return difference;
    }

    public short getProduct(short first,short second){
        short product = (short)(first * second);
        System.out.println("product is "+ product);
        return product;
    }

    public short getQuotient(short first,short second){
        short quotient = (short)(first / second);
        System.out.println("quotient is "+ quotient);
        return quotient;
    }

    public short getRemainder(short first,short second){
        short remainder = (short)(first % second); 
        System.out.println("remainder is "+ remainder);
        return remainder;
    }
}

