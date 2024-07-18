package org.eternity.generic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MoneyTest {
    @Test
    public void plus() {
        Money won1000 = Money.wons(1000);
        Money won2000 = Money.wons(2000);
        Money won3000 = won1000.plus(won2000);

        assertEquals(Money.wons(3000), won3000);
        assertEquals(Money.wons(1000), won1000);
        assertEquals(Money.wons(2000), won2000);
    }

    @Test
    public void minus() {
        Money won3000 = Money.wons(3000);
        Money won2000 = Money.wons(2000);
        Money won1000 = won3000.minus(won2000);

        assertEquals(Money.wons(1000), won1000);
        assertEquals(Money.wons(3000), won3000);
        assertEquals(Money.wons(2000), won2000);
    }

    @Test
    public void times() {
        Money won1000 = Money.wons(1000);
        Money won2000 = won1000.times(2);

        assertEquals(Money.wons(2000), won2000);
        assertEquals(Money.wons(1000), won1000);
    }

    @Test
    public void divideBy() {
        Money won2000 = Money.wons(2000);
        Money won1000 = won2000.divide(2);

        assertEquals(Money.wons(1000), won1000);
        assertEquals(Money.wons(2000), won2000);
    }

    @Test
    public void isLessThan() {
        Money won1000 = Money.wons(1000);
        Money won2000 = Money.wons(2000);

        assertTrue(won1000.isLessThan(won2000));

    }

    @Test
    public void isGreaterThanOrEqual() {
        Money won1000 = Money.wons(1000);
        Money won2000 = Money.wons(2000);

        assertTrue(won2000.isGreaterThanOrEqual(won2000));
    }
}
