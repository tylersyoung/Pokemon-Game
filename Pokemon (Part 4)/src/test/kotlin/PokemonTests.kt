import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import pokemon.Bulbasaur
import pokemon.Pokemon
import pokemon.WaterGun
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class PokemonTests {
    @Test
    fun `is abstract class`() = assertTrue(Pokemon::class.isAbstract)

    @Nested
    inner class DamageTests {
        @Test
        fun `reduces hitPoints by amount`() {
            val bulbasaur: Pokemon = Bulbasaur(100)
            bulbasaur.damage(20)

            assertEquals(80, bulbasaur.hitPoints)
        }

        @Test
        fun `increases hitPoints by amount when amount is negative`() {
            val bulbasaur: Pokemon = Bulbasaur(100)
            bulbasaur.damage(20)
            bulbasaur.damage(-10)

            assertEquals(90, bulbasaur.hitPoints)
        }

        @Test
        fun `does not allow hitPoints to go negative`() {
            val bulbasaur: Pokemon = Bulbasaur(100)
            bulbasaur.damage(120)

            assertEquals(0, bulbasaur.hitPoints)
        }

        @Test
        fun `does not allow hitPoints to exceed maxHitPoints`() {
            val bulbasaur: Pokemon = Bulbasaur(100)
            bulbasaur.damage(30)
            bulbasaur.damage(-50)

            assertEquals(100, bulbasaur.hitPoints)
        }
    }

    @Nested
    inner class LearnTests {
        fun `adds move to the pokemon's moves list`() {
            val bulbasaur: Pokemon = Bulbasaur(100)
            bulbasaur.learn(WaterGun())

            assertTrue(bulbasaur.moves[1] is WaterGun)
        }
    }
}
