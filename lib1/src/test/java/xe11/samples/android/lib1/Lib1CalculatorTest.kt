package xe11.samples.android.lib1

import org.junit.Test

internal class Lib1CalculatorTest {

    @Test
    fun `sum should `() {
        val sut = Lib1Calculator()

        val actual = sut.sum(1, 2)

        assert(actual == 3)
    }
}
