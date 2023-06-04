public class GrassPokemon extends Pokemon {
//// Variable declarations ////
    private String defence;
    private String attack;

//// Constructor ////
    public GrassPokemon(String name, int level, int hp, String defence, String attack) {
        super(name, level, hp);
        this.defence = defence;
        this.attack = attack;
    }

//// Getters and setters ////
    public String getDefence() {
        return defence;
    }

    public void setDefence(String defence) {
        this.defence = defence;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

//// Method declaration ////
    public void speak() {
        System.out.println("Hello, i'm a grass Pokemon.");
    }

    public void defenceSkill() {
        System.out.println("my defence skill is: " + defence);
    }

    public void attackSkill() {
        System.out.println("watch out! my attack skill is: " + attack);
    }

    public void eat() {
        System.out.println("Munch munch");
    }
}
