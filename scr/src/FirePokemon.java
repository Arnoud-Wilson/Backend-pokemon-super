public class FirePokemon extends Pokemon {
//// Variable declarations ////
    private int height;
    private int weight;

//// Constructor ////
    public FirePokemon(String name, int level, int hp, int height, int weight) {
        super(name, level, hp);
        this.height = height;
        this.weight = weight;
    }

//// Getters and setters ////
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

//// Method declaration ////
    @Override
    public void speak() {
        System.out.println("Hello, i'm a fire Pokemon.");
    }

    public void heightIndication() {
        System.out.println("i'm " + height + " inches tall");
    }

    public void weightIndication() {
        System.out.println("i'm " + weight + " pounds");
    }

    public void eat() {
        System.out.println("Mjam mjam");
    }
}
