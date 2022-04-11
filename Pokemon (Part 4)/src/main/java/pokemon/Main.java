package pokemon;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main
{
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        Pokemon playerOne = pickPokemon();
        Pokemon playerTwo = pickPokemon();
        Pokemon current = Math.random() >= 0.50 ? playerOne : playerTwo;
        Pokemon opponent = playerOne == current ? playerTwo : playerOne;

        System.out.println(playerOne);
        System.out.println(playerTwo + "\n");

        while (true)
        {
            System.out.println(current + " Knows: ");
            printList(current.getMoves());

            System.out.println("What Move Do You Want To Use? ");

            Move move = current.getMoves().get(collectInput(current.getMoves()));

            move.useOn(opponent);
            System.out.println(current + " Used " + move + " on " + opponent + "!\n");
            System.out.println(current);
            System.out.println(opponent + "\n");

            if (checkIfFainted(opponent))
            {
                System.out.println("Your " + opponent + " Has Fainted!");
                return;
            }

            Pokemon temp = current;
            current = opponent;
            opponent = temp;
        }
    }

    private static boolean checkIfFainted(Pokemon pokemon)
    {
        return pokemon.getHitPoints() == 0;
    }

    private static <T> void printList(List<T> pokemon)
    {
        for (int i = 0; i < pokemon.size(); i++)
        {
             System.out.println("(" + i + ") " + pokemon.get(i));
        }
    }

    private static <T> int collectInput(List<T> list)
    {
        while (true)
        {
            System.out.println("Enter an integer below.");
            int pokemonChoice; // Collect input then check if it is in bounds
            try
            {
                pokemonChoice = scanner.nextInt();
            }
            catch (InputMismatchException e)
            {
                System.out.println(" \n Invalid input, please try again. \n");
                scanner.nextLine();
                continue;
            }
            checkIfInBounds(pokemonChoice, list);
            return pokemonChoice;
        }
    }

    private static <T> void checkIfInBounds(int pokemonChoice, List<T> list)
    {
        while (true)
        {
            if(pokemonChoice > list.size())
            {
                System.out.println(" \n Invalid input, please try again. \n");
                collectInput(list);
                continue;
            }
            return;
        }
    }
    private static Pokemon pickPokemon()
    {

        ArrayList<Pokemon> pokemonList = new ArrayList<>();
        pokemonList.add(new Bulbasaur(100));
        pokemonList.add(new Charmander(100));
        pokemonList.add(new Squirtle(100));

        System.out.println("Choose a Pokemon! ");
        printList(pokemonList);
        return pokemonList.get(collectInput(pokemonList));
    }
}
