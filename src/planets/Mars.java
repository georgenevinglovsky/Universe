package planets;

public class Mars extends Planet {

    public static double diameter;

    static{
        diameter = 4212.3;
    }

    public Mars(String orbit, String planetName, int quantityOfSatellites, boolean isPlanetCold, boolean isPlanethot, boolean hasLife, boolean isRound, boolean hasOxygen, double gravityValue) {
        super(orbit, planetName, quantityOfSatellites, isPlanetCold, isPlanethot, hasLife, isRound, hasOxygen, gravityValue);
    }

    public static void rotate(){
        System.out.println("Mars makes one rotation every 24.6 hours");
    }


    @Override
    public int solarYear() {
        return 687;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
