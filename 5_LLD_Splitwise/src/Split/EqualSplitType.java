package Split;

import java.util.List;

public class EqualSplitType implements SplitTypeValid{

    @Override
    public void isValidSplitType(List<Split> splitList, double amount) throws Exception {
        double individualAmount = amount / splitList.size();
        for(Split split : splitList) {
            if (split.getAmount() != individualAmount)
                throw new Exception("Invalid Split");
        }
    }
}
