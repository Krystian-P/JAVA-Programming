public class TeenNumberChecker {

    public static boolean hasTeen(int numberOne, int numberTwo, int numberThree){
        if((numberOne<=19 && numberOne >= 13) || (numberTwo<=19 && numberTwo >= 13) || (numberThree<=19 && numberThree >= 13)) return true;
        return false;
    }

    public static boolean isTeen(int number){
        return (number<=19 && number >= 13);
    }
}
