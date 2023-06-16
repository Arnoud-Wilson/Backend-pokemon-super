public class Main {
    public static void main(String[] args) {
        FirePokemon charmander = new FirePokemon("Charmander", 12, 8, 2, 19);
        WaterPokemon psyDuck = new WaterPokemon("Psyduck", 14, 6, "bread", "quack quack");
        GrassPokemon bulbasaur = new GrassPokemon("Bulbasaur", 15, 8, "shield", "poison");
        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 10, 10, "kindness", 5);

        charmander.speak();
        charmander.eat();
        System.out.println(charmander.getHp());
        charmander.underAttack();
        System.out.println(charmander.getHp());

        psyDuck.speak();
        System.out.println(psyDuck.getFood());
        psyDuck.makeSound();

        bulbasaur.attackSkill();
        bulbasaur.defenceSkill();
        bulbasaur.speak();

        pikachu.accuracyLevel();
        pikachu.speak();
        pikachu.eat();
    }
}