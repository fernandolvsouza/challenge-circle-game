/**
 * Created by flvs on 6/10/16.
 */
public class Knight {
    int health;
    String name;
    boolean alive = true;


    public Knight(int health, String name) {
        this.health = health;
        this.name = name;
    }

    public void punch(Knight player, Punch p) {
        p.author = this;
        p.victim = player;
        player.health = player.health - p.value;
    }

    @Override
    public String toString() {
        return name + " ( H: " + health + ")";
    }

    public boolean alive() {
        return health > 0;
    }
}
