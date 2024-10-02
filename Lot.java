public class Lot {
    private int number; // Lot number
    private String description; // Description of the lot
    private Bid highestBid; // Current highest bid

    public Lot(int number, String description) {
        this.number = number;
        this.description = description;
        this.highestBid = null; // Initially, there are no bids
    }

    public int getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }

    public Bid getHighestBid() {
        return highestBid;
    }

    /**
     * Attempt to bid for this lot. A successful bid must have a value higher than any existing bid.
     * @param bid A new bid.
     * @return true if successful, false otherwise.
     */
    public boolean bidFor(Bid bid) {
        if (highestBid == null || bid.getValue() > highestBid.getValue()) {
            highestBid = bid;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Lot " + number + ": " + description + 
               (highestBid != null ? " (Current highest bid: " + highestBid.getValue() + ")" : " (No bids yet)");
    }
}