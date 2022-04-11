// Do not delete this line; simply ignore it and write your class below it
package pokemon;

// Copy your Part 1 implementation here
public class Squirtle extends Pokemon
{
    public Squirtle(int maxHitPoints)
    {
        super(7,"Squirtle", maxHitPoints);
        learn(new WaterGun());
    }
}