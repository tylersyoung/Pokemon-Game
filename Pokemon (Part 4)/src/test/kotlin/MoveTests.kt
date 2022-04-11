import org.junit.jupiter.api.Test
import pokemon.Move
import kotlin.test.assertTrue

class MoveTests {
    @Test
    fun `is an interface`() = assertTrue(Move::class.java.isInterface)
}
