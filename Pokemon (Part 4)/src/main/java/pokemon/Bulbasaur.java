// Do not delete this line; simply ignore it and write your class below it
package pokemon;

// Copy your Part 1 implementation here
public class Bulbasaur extends Pokemon
{
    public Bulbasaur(int maxHitPoints)
    {
        super(1, "Bulbasaur", maxHitPoints);
        learn(new VineWhip());
    }


}