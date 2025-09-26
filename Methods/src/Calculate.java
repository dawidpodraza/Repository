public class Calculate {
    static void main(String[] args) {
        double first = 12;
        double second = 4;

        Calculator calculator = new Calculator();
        double result1 = calculator.add(first,second);
        double result2 = calculator.subtract(first,second);
        double result3 = calculator.multiply(first,second);
        double result4 = calculator.divide(first,second);

        System.out.println(result1+" "+result2+" "+result3+" "+result4);
    }
}
