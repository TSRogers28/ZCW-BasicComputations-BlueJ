

public class IntegerPrinter {

    public String printIntegerAsBinary(int value){
        System.out.println(Integer.toString(value, 2));
        return Integer.toString(value, 2);
    }

    public String printIntegerAsOctal(int value){
        System.out.println(Integer.toString(value, 8));
        return Integer.toString(value, 8);
    }

    public String printIntegerAsHexadecimal(int value){
        System.out.println(Integer.toString(value, 16));
        return Integer.toString(value, 16);
    }

    public static void main(String[] args){

    }
}
