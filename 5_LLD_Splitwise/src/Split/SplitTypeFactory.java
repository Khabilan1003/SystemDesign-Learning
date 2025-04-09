package Split;

public class SplitTypeFactory {

    public static SplitTypeValid getSplitType(SplitType type) {
        switch (type) {
            case EQUAL:
                return new EqualSplitType();
            case UNEQUAL:
                return new UnequalSplitType();
            case PERCENTAGE:
                return new PercentageSplitType();
            default:
                return null;
        }
    }
}
