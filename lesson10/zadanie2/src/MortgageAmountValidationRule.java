public class MortgageAmountValidationRule extends ValidationRule<Integer> {
    private static final int MIN_AMOUNT = 1_000_000;
    private static final int MAX_AMOUNT = 10_000_000;

    public MortgageAmountValidationRule(Integer value) {
        super(value, "Минимальный размер ипотеки - " + MIN_AMOUNT + ", а максимальный - " + MAX_AMOUNT);
    }

    @Override
    public boolean isValid() {
        return value >= MIN_AMOUNT && value <= MAX_AMOUNT;
    }
}