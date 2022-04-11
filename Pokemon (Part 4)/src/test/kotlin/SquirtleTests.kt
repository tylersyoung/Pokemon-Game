import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import pokemon.*
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class SquirtleTests {
    @Test
    fun `extends the Pokemon class`() = assertTrue(Squirtle(100) is Pokemon)

    @Nested
    inner class GetPokedexIdTests {
        @Test
        fun `returns 7`() = assertEquals(7, (Squirtle(100) as Pokemon).pokedexId)
    }

    @Nested
    inner class GetSpeciesTests {
        @Test
        fun `returns Squirtle`() = assertEquals("Squirtle", (Squirtle(100) as Pokemon).species)
    }

    @Nested
    inner class GetMaxHitPointsTests {
        @Test
        fun `returns value passed into constructor`() =
            assertEquals(42, (Squirtle(42) as Pokemon).maxHitPoints)
    }

    @Nested
    inner class GetHitPointsTests {
        @Test
        fun `is initialized to the maxHitPoints value`() =
            assertEquals(1337, (Squirtle(1337) as Pokemon).hitPoints)
    }

    @Nested
    inner class GetMovesTests {
        @Test
        fun `knows Water Gun after construction`() = assertTrue(Squirtle(100).moves[0] is WaterGun)
    }

    @Nested
    inner class ToStringTests {
        @Test
        fun `includes species, hitPoints, and maxHitPoints in the correct format`() =
            assertEquals("Squirtle (90/90 HP)", (Squirtle(90) as Pokemon).toString())
    }
}
