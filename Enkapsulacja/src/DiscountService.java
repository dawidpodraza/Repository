public class DiscountService {
    private double finalPrice;


    double discountPrice(Client client, double price) {
        if (client.isPremium()) {
            return premiumDiscount(price);
        } else {
            return standardDiscount(price);
        }


    }

    private double standardDiscount(double price) {
        if (price > 1000) {
            return price * 0.9;
        } else {
            return price;
        }
    }

    private double premiumDiscount(double price) {
        if (price > 1000) {
            return price * 0.85;
        } else {
            return price * 0.95;
        }
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    private void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }
}
