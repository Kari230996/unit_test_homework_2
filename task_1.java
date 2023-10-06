/*
 * *Задание 1.

Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет, является ли переданное число четным или нечетным. (код приложен в презентации)
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberUtilTest {

    @Test
    public void testEvenNumber() {
        NumberUtil util = new NumberUtil();
        assertTrue(util.evenOddNumber(4));
    }

    @Test
    public void testOddNumber() {
        NumberUtil util = new NumberUtil();
        assertFalse(util.evenOddNumber(7));
    }

    @Test
    public void testZero() {
        NumberUtil util = new NumberUtil();
        assertTrue(util.evenOddNumber(0));
    }

    @Test
    public void testNegativeNumber() {
        NumberUtil util = new NumberUtil();
        assertFalse(util.evenOddNumber(-3));
    }
}
