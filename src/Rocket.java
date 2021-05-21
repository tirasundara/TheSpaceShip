public class Rocket implements SpaceShip {
    private Integer cost;
    private Integer weight;
    private Integer maxWeight;

    Rocket(Integer cost, Integer weight, Integer maxWeight) {
        this.cost = cost;
        this.weight = weight;
        this.maxWeight = maxWeight;
    }

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
        return this.weight + item.getWeight() <= this.maxWeight;
    }

    @Override
    public void carry(Item item) {
        setWeight(this.weight + item.getWeight());
    }

    private void setWeight(Integer weight) {
        this.weight = weight;
    }
}
