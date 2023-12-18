import java.util.List;

public abstract class Pokemon {

     String name;
     int level;
     int hp;
     String food;

     String type;

     String sound;

     List <String> attacks;
    public Pokemon(String name, int level, int hp, String food, String sound) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
    }

    public String getName() {

        return name;
    }

    public int getHp() {
        return hp;
    }

    public String getType() {
        return type;
    }
    public String getFood() {
        return food;
    }
    List<String> getAttacks() {
        return attacks;
    }

    public int getLevel() {
        return level;
    }

    public String getSound() {
        return sound;
    }


}