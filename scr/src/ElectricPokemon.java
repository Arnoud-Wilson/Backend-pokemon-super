public class ElectricPokemon extends Pokemon {

    private String special;
    private int accuracy;


    public ElectricPokemon(String name, int level, int hp, String special, int accuracy) {
        super(name, level, hp);
        this.special = special;
        this.accuracy = accuracy;
    }


    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }


    @Override
    public void speak() {
        System.out.println("Hello, i'm an electric Pokemon.");
    }

    public void specialSkill() {
        System.out.println("i'm very special! i can " + special);
    }

    public void accuracyLevel() {
        System.out.println("my accuracy level is: " + accuracy);
    }

    public void eat() {
        System.out.println("Chomp chomp");
    }
}
