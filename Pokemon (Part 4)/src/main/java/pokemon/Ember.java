// Do not delete this line; simply ignore it and write your class below it
package pokemon;

public class Ember implements Move
{
    public void useOn(Pokemon pokemon)
    {
        pokemon.damage(12);
    }
    public String toString()
    {
        return "Ember";
    }
}