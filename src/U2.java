public class U2 extends Rocket {

    U2() {
        this.cost = 120;
        this.weight = 18000;
        this.currentWeight = this.weight;
        this.maxWeight = 29000;
        this.launchExplosionPercentage = 0.04;
        this.landingCrashPercentage = 0.08;
    }

    @Override
    public boolean launch() {
        Integer random = (int) Math.random() * 100 + 1;
        Double explosionChance = this.launchExplosionPercentage * (this.cargoCarried() / this.cargoLimit());

        return explosionChance <= random;
    }

    @Override
    public boolean land() {
        Integer random = (int) Math.random() * 100 + 1;
        Double explosionChance = this.landingCrashPercentage * (this.cargoCarried() / this.cargoLimit());

        return explosionChance <= random;
    }
}
