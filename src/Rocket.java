public class Rocket implements SpaceShip {
    protected int cost;                         // in million
    protected int weight;                       // in kg
    protected int maxWeight;                    // in kg
    protected int currentWeight;                // in kg
    protected double landingCrashPercentage;
    protected double launchExplosionPercentage;

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

    protected int cargoCarried() {
        return this.currentWeight - this.weight;
    }

    protected int cargoLimit() {
        return this.maxWeight - this.weight;
    }

    protected double cargoCarriedToCargoLimit() {
        return this.cargoCarried() / (double) this.cargoLimit();
    }

    protected int random() {
        return (int) (Math.random() * 10) + 1;
    }
}
