public class WaterPokemon extends Pokemon {
//// Variable declarations ////
    private String food;
    private String sound;

//// Constructor ////
    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp);
        this.food = food;
        this.sound = sound;
    }

//// Getters and setters ////
    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

//// Method declaration ////
    public void speak() {
        System.out.println("Hello, i'm a water Pokemon.");
    }

    public void eat() {
        System.out.println("i like to eet " + food);
    }

    public void makeSound() {
        System.out.println("i make " + sound + " sound");
    }
}
