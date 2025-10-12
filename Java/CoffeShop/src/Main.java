public class Main {
    static void main(String[] args) {

        Order[] orders ={
                new Order("Dawid",DrinkType.TEA),
                new Order("Kamil",DrinkType.COFFEE),
                new SpecialOrder("Maria",DrinkType.COFFEE,true),
                new Order("Piotrek",DrinkType.WATER)
        };

        StringBuilder report = new StringBuilder();
        report.append("===Raport zamówień ===");

        double total =0;

        for (int i = 0; i < orders.length ; i++) {
            double price = orders[i].calculatePrice();
            total+=price;
        }

        report.append("Suma za wszystkie zamówienia: ").append(total).append(" PLN");

        System.out.println(report.toString());
    }
}
