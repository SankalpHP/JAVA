public class KilometerPerHour {

    public static long toMilesPerHour( double kilometersPerHour) {

        if(  kilometersPerHour < 0  ) {
            return -1;
        }
        return Math.round( kilometersPerHour / 1.609 );
    }
    public static void Printconverstion(double kilometersPerHour){

        if ( kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }
        else {
            long milesperhours = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + "Km/hr= " + milesperhours + "mi/hr");
        }
    }
}
