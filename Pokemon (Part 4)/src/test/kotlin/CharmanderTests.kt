
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import pokemon.Charmander
import pokemon.Ember
import pokemon.Pokemon
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class CharmanderTests {
    @Test
    fun `extends the Pokemon class`() = assertTrue(Charmander(100) is Pokemon)

    @Nested
    inner class GetPokedexIdTests {
        @Test
        fun `returns 4`() = assertEquals(4, (Charmander(100) as Pokemon).pokedexId)
    }

    @Nested
    inner class GetSpeciesTests {
        @Test
        fun `returns Charmander`() = assertEquals("Charmander", (Charmander(100) as Pokemon).species)
    }

    @Nested
    inner class GetMaxHitPointsTests {
        @Test
        fun `returns value passed into constructor`() =
            assertEquals(42, (Charmander(42) as Pokemon).maxHitPoints)
    }

    @Nested
    inner class GetHitPointsTests {
        @Test
        fun `is initialized to the maxHitPoints value`() =
            assertEquals(1337, (Charmander(1337) as Pokemon).hitPoints)
    }

    @Nested
    inner class GetMovesTests {
        @Test
        fun `knows Ember after construction`() = assertTrue(Charmander(100).moves[0] is Ember)
    }

    @Nested
    inner class ToStringTests {
        @Test
        fun `includes species, hitPoints, and maxHitPoints in the correct format`() =
            assertEquals("Charmander (90/90 HP)", (Charmander(90) as Pokemon).toString())
    }
}
