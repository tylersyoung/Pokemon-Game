// Do not delete this line; simply ignore it and write your class below it
package pokemon;

public class WaterGun implements Move
{
    public void useOn(Pokemon pokemon)
    {
        pokemon.damage(14);
    }

    public String toString()
    {
        return "Water Gun";
    }
}