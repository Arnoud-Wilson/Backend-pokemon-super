public abstract class Pokemon {
//// Variable declarations ////
    private String name;
    private int level;
    private int hp;

//// Constructor ////
    public Pokemon(String name, int level, int hp) {
        this.name = name;
        this.level = level;
        this.hp = hp;
    }

//// Getters and setters ////
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

//// Method declarations ////
    public void speak() {
        System.out.println("Hello, i'm a Pokemon.");
    }

    public abstract void eat();

    public void underAttack() {
        hp--;
    }
}
