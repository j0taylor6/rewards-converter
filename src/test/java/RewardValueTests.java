import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        RewardValue rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue(), "Cash value not set correctly in constructor.");
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        RewardValue rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue(), "Miles value not set correctly in constructor.");
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        double expectedMiles = cashValue / 0.0035;
        RewardValue rewardValue = new RewardValue(cashValue);
        assertEquals(expectedMiles, rewardValue.getMilesValue(), "Conversion from cash to miles is incorrect.");
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000;
        double expectedCash = milesValue * 0.0035;
        RewardValue rewardValue = new RewardValue(milesValue);
        assertEquals(expectedCash, rewardValue.getCashValue(), "Conversion from miles to cash is incorrect.");
    }
}
