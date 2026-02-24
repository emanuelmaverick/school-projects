package Chapter2;

public class TypeCasting {

    public static void main (String args[]){

        char symbol;

        symbol = '7';

        System.out.println((int)(symbol));

        double number1;

        number1 = 7;

        System.out.println((int)(number1));

        byte number2;

        number2 = 7;

        System.out.println((char)(number2));

        char number3;

        number3 = '7';

        System.out.println((char)(number3-(0)));

    }

}