package planets;

public class Earth extends Planet{
    public Earth(String orbit, String planetName, int quantityOfSatellites, boolean isPlanetCold, boolean isPlanethot, boolean hasLife, boolean isRound, boolean hasOxygen, double gravityValue) {
        super(orbit, planetName, quantityOfSatellites, isPlanetCold, isPlanethot, hasLife, isRound, hasOxygen, gravityValue);
    }

    @Override
    public int solarYear() {
        return 365;
    }

    @Override
    public int quantityOfSatellites() {
        return 1;
    }
}
