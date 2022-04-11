// Do not delete this line; simply ignore it and write your class below it
package pokemon;

import java.util.ArrayList;
import java.util.List;

public abstract class Pokemon
{
    private int pokedexId;
    private String species;
    private int maxHitPoints;
    private int hitPoints;
    private List<Move> moveList;

    public Pokemon(int pokedexId, String species, int maxHitPoints)
    {
        this.pokedexId = pokedexId;
        this.species = species;
        this.maxHitPoints = maxHitPoints;
        hitPoints = maxHitPoints;
        moveList = new ArrayList<>();
    }

    public List<Move> getMoves()
    {
        return moveList;
    }

    public void learn(Move move)
    {
        moveList.add(move);
    }

    public void damage (int damage)
    {
        hitPoints -= damage;
        hitPoints = Math.min(hitPoints, maxHitPoints);
        hitPoints = Math.max(hitPoints, 0);
    }

    public int getPokedexId()
    {
        return this.pokedexId;
    }

    public int getMaxHitPoints()
    {
        return this.maxHitPoints;
    }

    public int getHitPoints()
    {
        return this.hitPoints;
    }

    public String getSpecies()
    {
        return this.species;
    }

    public String toString()
    {
        return String.format("%s (%d/%d HP)",
            species,
            hitPoints,
            maxHitPoints);
    }
}