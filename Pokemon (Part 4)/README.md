Pokémon (Part 4)
================

Now that we've simulated a basic battle, we'll focus on improving the "User Experience" (also known as "UX" in software engineering).

Assignment Requirements
-----------------------

Update the `Main` class so that it:

- Asks the user(s) to choose which two Pokémon will be battling (offer a choice between all three starter Pokémon).
- Simulates a coin flip for which Pokémon goes first in the battle (in the actual game, a Pokémon's speed stat would determine this, but we haven't implemented stats!).
- Handles input errors appropriately if the user tries to input an invalid Pokémon or move. The program should ask the user to try again until a valid choice is given. However, don't worry about the user entering an incorrect data type (e.g., entering text when they're asked to enter an integer).

Generating Random Values
------------------------

There are two main ways of generating random values in Java:

- Using `Math.random()`
- Using the `Random` class

`Math.random` is the simpler option, but it's extremely limited in that it will only produce a random `double` between `0.0` (inclusive) and `1.0` (exclusive):

```
double num = Math.random();
```

The `Random` class gives us much more flexibility in what values are produced, but we have to create a `Random` instance before we can start getting values:

```
Random rng = new Random();
double num = rng.nextDouble(); // Works just like Math.random();
int num2 = rng.nextInt(5); // Produces a random int between 0 (inclusive) and 5 (exclusive)
boolean isTrue = rng.nextBoolean();
```

Also note that the `Random` class exists in the `java.util` package, and will need to be imported before you can use it.

Official documentation for `Math.random`: https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#random--

Official documentation for Random: https://docs.oracle.com/javase/8/docs/api/java/util/Random.html