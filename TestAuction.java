
public class TestAuction {
    public static void main(String[] args) {
        // Create an auction
        Auction auction = new Auction();

        // Enter lots into the auction
        auction.enterLot("Antique Vase");
        auction.enterLot("Vintage Car");
        auction.enterLot("Rare Painting");

        // Show all the lots
        System.out.println("Available Lots:");
        auction.showLots();

        // Create bidders (persons)
        Person person1 = new Person("Alice");
        Person person2 = new Person("Bob");

        // Make some bids
        System.out.println("\nBidding process:");

        // Alice bids on the first lot (Antique Vase)
        auction.makeABid(1, person1, 100);

        // Bob tries to bid lower than Alice on the first lot
        auction.makeABid(1, person2, 80);

        // Bob bids higher on the first lot
        auction.makeABid(1, person2, 120);

        // Alice bids on the second lot (Vintage Car)
        auction.makeABid(2, person1, 5000);

        // Show the updated list of lots and their highest bids
        System.out.println("\nUpdated Lots:");
        auction.showLots();
    }
}
