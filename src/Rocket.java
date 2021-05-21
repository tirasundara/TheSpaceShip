public class Rocket implements SpaceShip {
    protected Integer cost;                         // in million
    protected Integer weight;                       // in kg
    protected Integer maxWeight;                    // in kg
    protected Integer currentWeight;                // in kg
    protected Double landingCrashPercentage;
    protected Double launchExplosionPercentage;

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean canCarry(Item item) {
        return this.currentWeight + item.getWeight() <= this.maxWeight;
    }

    @Override
    public void carry(Item item) {
        this.currentWeight += item.getWeight();
    }

    protected Integer cargoCarried() {
        return this.currentWeight - this.weight;
    }

    protected Integer cargoLimit() {
        return this.maxWeight - this.weight;
    }

    public String toString() {
        return "Rocket: " + String.valueOf(this.currentWeight);
    }
}
