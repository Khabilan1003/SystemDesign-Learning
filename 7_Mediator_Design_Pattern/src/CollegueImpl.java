public class CollegueImpl implements Collegue{
    private String name;
    private Mediator mediator;

    public CollegueImpl(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
        mediator.addBidder(this);
    }

    @Override
    public void placeBid(Double amount) {
        mediator.setBidAmount(amount, this);
    }

    @Override
    public void receiveBidNotification(Double amount) {
        System.out.println("Bidder : " + name + ", bidding raised to amount " + amount);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
