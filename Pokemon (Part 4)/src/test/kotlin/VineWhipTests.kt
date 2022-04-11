
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import pokemon.Bulbasaur
import pokemon.Move
import pokemon.VineWhip
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class VineWhipTests {
    @Test
    fun `implements the Move interface`() = assertTrue(VineWhip() is Move)

    @Nested
    inner class UseOnTests {
        @Test
        fun `reduces hitPoints by 15`() {
            val bulbasaur = Bulbasaur(100)
            (VineWhip() as Move).useOn(bulbasaur)

            assertEquals(85, bulbasaur.hitPoints)
        }
    }

    @Nested
    inner class ToStringTests {
        @Test
        fun `is Vine Whip`() = assertEquals("Vine Whip", VineWhip().toString())
    }
}
