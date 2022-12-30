package planets;

public abstract class Planet {
    private String orbit,planetName;
    private int quantityOfSatellites;
    private boolean isPlanetCold, isPlanethot, hasLife, isRound,hasOxygen;
    private double gravityValue;

    public String getOrbit() {
        return orbit;
    }

    public void setOrbit(String orbit) {
        this.orbit = orbit;
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public int getQuantityOfSatellites() {
        return quantityOfSatellites;
    }

    public void setQuantityOfSatellites(int quantityOfSatellites) {

        this.quantityOfSatellites = quantityOfSatellites;
    }

    public boolean isPlanetCold() {
        return isPlanetCold;
    }

    public void setPlanetCold(boolean planetCold) {
        isPlanetCold = planetCold;
    }

    public boolean isPlanethot() {
        return isPlanethot;
    }

    public void setPlanethot(boolean planethot) {
        isPlanethot = planethot;
    }

    public boolean isHasLife() {
        return hasLife;
    }

    public void setHasLife(boolean hasLife) {
        this.hasLife = hasLife;
    }

    public boolean isRound() {
        return isRound;
    }

    public void setRound(boolean round) {
        isRound = round;
    }

    public boolean isHasOxygen() {
        return hasOxygen;
    }

    public void setHasOxygen(boolean hasOxygen) {
        this.hasOxygen = hasOxygen;
    }

    public double getGravityValue() {
        return gravityValue;
    }

    public void setGravityValue(double gravityValue) {
        this.gravityValue = gravityValue;
    }

    public abstract int solarYear();//method should return q-ty of days for one solar year of this planet



}
/*
Hannan - Venus
Saiana - Mars
Hakob - Earth
George - Sun
John - Saturn
Faith - Jupiter
Robert - Neptune
Hamid - Uranus
 */