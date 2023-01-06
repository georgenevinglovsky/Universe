package planets;

public class Saturn extends Planet{
    @Override
    public String getOrbit() {
        return super.getOrbit();
    }

    public Saturn(String orbit, String planetName, int quantityOfSatellites, boolean isPlanetCold, boolean isPlanethot, boolean hasLife, boolean isRound, boolean hasOxygen, double gravityValue) {
        super(orbit, planetName, quantityOfSatellites, isPlanetCold, isPlanethot, hasLife, isRound, hasOxygen, gravityValue);
    }

    @Override
    public int solarYear(){
        return 29;
    }
    @Override
    public int quantityOfSatellites(){
        return 83;
    }

}
