package planets;

public class Jupiter extends Planet{

    public Jupiter(String orbit, String planetName, int quantityOfSatellites, boolean isPlanetCold, boolean isPlanethot, boolean hasLife, boolean isRound, boolean hasOxygen, double gravityValue) {
        super(orbit, planetName, quantityOfSatellites, isPlanetCold, isPlanethot, hasLife, isRound, hasOxygen, gravityValue);
    }

    @Override
    public int solarYear() {
        return 0;
    }
}
