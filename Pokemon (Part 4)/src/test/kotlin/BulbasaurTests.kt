
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import pokemon.Bulbasaur
import pokemon.Pokemon
import pokemon.VineWhip
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class BulbasaurTests {
    @Test
    fun `extends the Pokemon class`() = assertTrue(Bulbasaur(100) is Pokemon)

    @Nested
    inner class GetPokedexIdTests {
        @Test
        fun `returns 1`() = assertEquals(1, (Bulbasaur(100) as Pokemon).pokedexId)
    }

    @Nested
    inner class GetSpeciesTests {
        @Test
        fun `returns Bulbasaur`() = assertEquals("Bulbasaur", (Bulbasaur(100) as Pokemon).species)
    }

    @Nested
    inner class GetMaxHitPointsTests {
        @Test
        fun `returns value passed into constructor`() =
            assertEquals(42, (Bulbasaur(42) as Pokemon).maxHitPoints)
    }

    @Nested
    inner class GetHitPointsTests {
        @Test
        fun `is initialized to the maxHitPoints value`() =
            assertEquals(1337, (Bulbasaur(1337) as Pokemon).hitPoints)
    }

    @Nested
    inner class GetMovesTests {
        @Test
        fun `knows Vine Whip after construction`() = assertTrue(Bulbasaur(100).moves[0] is VineWhip)
    }

    @Nested
    inner class ToStringTests {
        @Test
        fun `includes species, hitPoints, and maxHitPoints in the correct format`() =
            assertEquals("Bulbasaur (90/90 HP)", (Bulbasaur(90) as Pokemon).toString())
    }
}
