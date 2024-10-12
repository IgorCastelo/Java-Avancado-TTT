package PWrapper;

public class WrapperTest01 {
    public static void main(String[] args) {


        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        char charP = 'w';
        boolean booleanP = false;

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;//outboxing
        Long longW = 10L;
        Float floatW = 10F;
        Character charW = 'w';
        Boolean booleanW = false;

        int i = intW;//unboxing

        Integer intW2 = Integer.parseInt("1");
        Boolean verdaderiro = Boolean.parseBoolean("TRue");
        System.out.println(verdaderiro);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isUpperCase('b'));
        System.out.println(Character.isLowerCase('b'));
        System.out.println(Character.toLowerCase('B'));
        System.out.println(Character.toUpperCase('b'));


    }
}
