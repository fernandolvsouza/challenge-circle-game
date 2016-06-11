/**
 * Created by flvs on 6/10/16.
 */
public class Punch {
    Knight author;
    Knight victim;
    int value;

    @Override
    public String toString() {
        return author.toString() + " punched " + victim.toString() + " with power " + value;
    }
}
