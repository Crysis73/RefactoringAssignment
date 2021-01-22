public class InsuranceStrategyMedium extends InsuranceStrategy {
    @Override
    public int getAdjustment() {
        return 10000;
    }

    @Override
    public double getWeight() {
        return .2;
    }

    @Override
    public int getConstant() {
        return 35600;
    }
}
