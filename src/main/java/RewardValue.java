public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        convertCashToMiles();
    }

    // Constructor that accepts a value in miles
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        convertMilesToCash();
    }

    // Method to get the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value
    public double getMilesValue() {
        return milesValue;
    }

    // Method to convert cash to miles
    private void convertCashToMiles() {
        this.milesValue = this.cashValue / 0.0035; // Convert cash to miles
    }

    // Method to convert miles to cash
    private void convertMilesToCash() {
        this.cashValue = this.milesValue * 0.0035; // Convert miles to cash
    }
}
