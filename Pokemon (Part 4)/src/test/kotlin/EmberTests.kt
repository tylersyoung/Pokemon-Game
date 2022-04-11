
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import pokemon.Bulbasaur
import pokemon.Ember
import pokemon.Move
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class EmberTests {
    @Test
    fun `implements the Move interface`() = assertTrue(Ember() is Move)

    @Nested
    inner class UseOnTests {
        @Test
        fun `reduces hitPoints by 12`() {
            val bulbasaur = Bulbasaur(100)
            (Ember() as Move).useOn(bulbasaur)

            assertEquals(88, bulbasaur.hitPoints)
        }
    }

    @Nested
    inner class ToStringTests {
        @Test
        fun `is Ember`() = assertEquals("Ember", Ember().toString())
    }
}
