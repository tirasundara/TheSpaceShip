public class U1 extends Rocket {

    U1() {
        this.cost = 100;
        this.weight = 10000;
        this.currentWeight = this.weight;
        this.maxWeight = 18000;
        this.launchExplosionPercentage = 5.0;
        this.landingCrashPercentage = 1.0;
    }

    @Override
    public boolean launch() {
        double explosionChance = this.launchExplosionPercentage * this.cargoCarriedToCargoLimit();
        return explosionChance <= this.random();
    }

    @Override
    public boolean land() {
        double explosionChance = this.landingCrashPercentage * this.cargoCarriedToCargoLimit();
        return explosionChance <= this.random();
    }
}
