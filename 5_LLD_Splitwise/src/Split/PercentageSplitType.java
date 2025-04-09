package Split;

import java.util.List;

public class PercentageSplitType implements SplitTypeValid{
    @Override
    public void isValidSplitType(List<Split> splitList, double amount) throws Exception {
        double totalAmount = 0;
        for(Split split: splitList) {
            totalAmount += split.getAmount();
        }

        if(amount != totalAmount)
            throw new Exception("Invalid Split");
    }
}
