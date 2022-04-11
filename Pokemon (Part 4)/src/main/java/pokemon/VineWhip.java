// Do not delete this line; simply ignore it and write your class below it
package pokemon;

public class VineWhip implements Move
{
    public void useOn(Pokemon pokemon)
    {
        pokemon.damage(15);
    }

    public String toString()
    {
        return "Vine Whip";
    }
}
