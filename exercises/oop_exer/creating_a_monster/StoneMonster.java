package exercises.oop_exer.creating_a_monster;

public class StoneMonster extends Monster {

    public StoneMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with stones!";
    }
}
