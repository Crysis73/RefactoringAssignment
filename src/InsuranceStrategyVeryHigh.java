public class InsuranceStrategyVeryHigh {

    public double calculateInsuranceVeryHigh(double income) {
        return (income-getAdjustment())*getWeight()+getConstant();
    }

    public int getAdjustment() {
        return 60000;
    }

    public double getWeight() {
        return 0.02;
    }

    public int getConstant() {
        return 105600;
    }
}
