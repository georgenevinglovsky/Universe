package planets;

public class Mercury extends Planet {


    public Mercury(String orbit, String planetName, int quantityOfSatellites, boolean isPlanetCold, boolean isPlanethot, boolean hasLife, boolean isRound, boolean hasOxygen, double gravityValue) {
        super(orbit, planetName, quantityOfSatellites, isPlanetCold, isPlanethot, hasLife, isRound, hasOxygen, gravityValue);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int solarYear() {
        return 88;
    }
}
