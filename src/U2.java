public class U2 extends Rocket {

    U2() {
        this.cost = 120;
        this.weight = 18000;
        this.currentWeight = this.weight;
        this.maxWeight = 29000;
        this.launchExplosionPercentage = 4.0;
        this.landingCrashPercentage = 8.0;
    }

    @Override
    public boolean launch() {
        double explosionChance = this.launchExplosionPercentage * this.cargoCarriedToCargoLimit();
        return explosionChance <= this.random();
    }

    @Override
    public boolean land() {
        double explosionChance = this.launchExplosionPercentage * this.cargoCarriedToCargoLimit();
        return explosionChance <= this.random();
    }
}
