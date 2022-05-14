import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndUnderLimit() {

        BonusService service = new BonusService();

        long actual = service.calculate(1000_60, true);
        long expected = 30;

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        long actual = service.calculate(1_000_000_60, true);
        long expected = 500;

        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void shouldCalcBonusIfHugeAmountNotRegistered() {
        BonusService service = new BonusService();

        long actual = service.calculate(10_000_000, true);
        long expected = 500;

        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculatedForRegisteredAndNegativeLimit() {
        BonusService service = new BonusService();

        long actual = service.calculate(-500,true);
        long expected = 0;

        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculatedForRegisteredAndZeroLimit() {
        BonusService service = new BonusService();

        long actual = service.calculate(0,true);
        long expected = 0;

        assertEquals(expected, actual);
    }
}