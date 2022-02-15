public class Main {

    public static void main(String[] args){

        double miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);

        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);

        SpeedConverter.printConversion(10.5);
        DecimalComparator.areEqualByThreeDecimalPlaces(2.32, 2.11);
    }
}
