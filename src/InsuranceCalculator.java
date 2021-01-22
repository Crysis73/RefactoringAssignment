import java.util.*;

public class InsuranceCalculator {

    private InsuranceStrategy strategy;
    private int[] insuranceBrackets = {10000, 35600, 76500, Integer.MAX_VALUE};
    private HashMap<Integer, InsuranceStrategy> mapping = new HashMap();

    public InsuranceCalculator() {
        mapping.put(0, new InsuranceStrategyLow());
        mapping.put(1, new InsuranceStrategyMedium());
        mapping.put(2, new InsuranceStrategyHigh());
        mapping.put(3, new InsuranceStrategyVeryHigh());
    }

    public double calculateInsurance(double income) {
        strategy = getInsuranceStrategy(income);
        return strategy.calculate(income);
    }

    private InsuranceStrategy getInsuranceStrategy(double income) {
        Integer index = 0;
        for (int i = 0; i<insuranceBrackets.length; i++) {
            if (income <= insuranceBrackets[i]) {
                index = i;
                break;
            }
        }

        return mapping.get(index);
    }

}
