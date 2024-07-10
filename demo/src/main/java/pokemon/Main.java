package pokemon;

public class Main {

    public static void main(String[] args) {
        Pokemon squirtle = new Pokemon("Squirtle", 50, "Water", "uncommon", new String[] { "Tackle", "Tail Whip",
                "Water Gun", "Withdraw", "Rapid Spin", "Bite", "Water Pulse", "Protect", "Rain Dance", "Aqua Tail" });
        Pokemon bulbasaur = new Pokemon("Bulbasaur", 80, "Grass", "uncommon", new String[] { "Tackle", "Growl",
                "Vine Whip", "Growth", "Leech Seed", "Solar Beam", "Razor Leaf", "Poison Powder", "Sleep Powder",
                "Synthesis" });
        Pokemon oshawott = new Pokemon("Oshawott", 160, "Water", "SUPER DUPER RARE",
                new String[] { "Tackle", "Tail Whip",
                        "Razor Shell", "Pshyco Boost", "Hyper Beam", "Giga Impact", "Dragon Ascent", "Geomancy",
                        "Bolt Strike",
                        "Draco Meteor" });

        System.out.println(squirtle.useARandomMove());
        System.out.println(squirtle.getNameAndType());
        System.out.println(squirtle.useXSpeed());

        System.out.println(bulbasaur.useARandomMove());
        System.out.println(bulbasaur.getNameAndType());
        System.out.println(bulbasaur.useXSpeed());

        System.out.println(oshawott.useARandomMove());
        System.out.println(oshawott.getNameAndType());
        System.out.println(oshawott.useXSpeed());
    }
}
