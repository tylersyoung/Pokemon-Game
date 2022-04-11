// Do not delete this line; simply ignore it and write your class below it
package pokemon;

// Copy your Part 1 implementation here
public class Charmander extends Pokemon
{
    public Charmander(int maxHitPoints)
    {
        super(4, "Charmander", maxHitPoints);
        learn(new Ember());
    }
}