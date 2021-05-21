public class U1 extends Rocket {

    U1() {
        this.cost = 100;
        this.weight = 10000;
        this.maxWeight = 18000;
        this.launchExplosionPercentage = 0.05;
        this.landingCrashPercentage = 0.01;
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
