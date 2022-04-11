
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import pokemon.Bulbasaur
import pokemon.Move
import pokemon.WaterGun
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class WaterGunTests {
    @Test
    fun `implements the Move interface`() = assertTrue(WaterGun() is Move)

    @Nested
    inner class UseOnTests {
        @Test
        fun `reduces hitPoints by 14`() {
            val bulbasaur = Bulbasaur(100)
            (WaterGun() as Move).useOn(bulbasaur)

            assertEquals(86, bulbasaur.hitPoints)
        }
    }

    @Nested
    inner class ToStringTests {
        @Test
        fun `is Water Gun`() = assertEquals("Water Gun", WaterGun().toString())
    }
}
