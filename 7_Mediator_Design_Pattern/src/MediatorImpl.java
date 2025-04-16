import java.util.ArrayList;
import java.util.List;

public class MediatorImpl implements Mediator{
    List<Collegue> collegues;

    public MediatorImpl() {
        collegues = new ArrayList<>();
    }

    @Override
    public void setBidAmount(Double amount, Collegue bidder) {
        for(Collegue collegue : collegues) {
            if(!collegue.getName().equalsIgnoreCase(bidder.getName())) {
                collegue.receiveBidNotification(amount);
            }
        }
        System.out.println();
    }

    @Override
    public void addBidder(Collegue collegue) {
        collegues.add(collegue);
    }
}
