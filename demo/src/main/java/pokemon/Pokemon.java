package pokemon;

import java.util.Random;

public class Pokemon {
    public String name;
    public int Speed;
    public String type;

    private String rarity;
    private String[] moves;

    public Pokemon(String name, int Speed, String type, String rarity, String[] moves) {
        this.name = name;
        this.Speed = Speed;
        this.type = type;
        this.rarity = rarity;
        this.moves = moves;
    }

    public String useARandomMove() {
        Random random = new Random();

        return this.name + " used " + this.moves[random.nextInt(10 - 1) + 1];
    }

    public String getNameAndType() {
        return "The pokemon is called " + this.name + " and its type is " + this.type;
    }

    public int useXSpeed() {
        if (this.Speed == 160) {
            System.out.println(this.name + " maxed speed has been reached");
            return this.Speed;
        }
        this.Speed += 10;
        return this.Speed + 10;
    }

}
