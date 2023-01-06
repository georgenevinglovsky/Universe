package planets;

public class Venus extends Planet implements CreateLife{
    public Venus(String orbit, String planetName, int quantityOfSatellites, boolean isPlanetCold, boolean isPlanethot, boolean hasLife, boolean isRound, boolean hasOxygen, double gravityValue) {
        super(orbit, planetName, quantityOfSatellites, isPlanetCold, isPlanethot, hasLife, isRound, hasOxygen, gravityValue);
    }

    @Override
    public void createLife() {
        System.out.println("LIFE ON VENUS\n" +
                "Venus is an unlikely place for life as we know it, but some scientists \n" +
                "theorize microbes might exist high in the clouds where it’s cooler and the \n" +
                "pressure is similar to Earth’s surface. Phosphine, a possible indicator of \n" +
                "microbial life, has been observed in the clouds.");
    }

    @Override
    public int solarYear() {
        return 225;
    }

    @Override
    public int quantityOfSatellites() {
        return 0;
    }

}
