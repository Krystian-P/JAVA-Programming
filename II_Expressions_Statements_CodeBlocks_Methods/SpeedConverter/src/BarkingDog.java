public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(!barking) return false;
        if((hourOfDay >= 8 && hourOfDay <= 22) || hourOfDay < 0 || hourOfDay > 24) return false;
        return true;
    }

}
