public class Item {
    private String name;
    private Integer weight;

    Item(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name;
    }
}
