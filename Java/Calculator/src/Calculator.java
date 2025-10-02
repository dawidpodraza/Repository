void main() {
    Counter counter = new Counter();
    Questioner questioner = new Questioner();

    Scanner scanner = new Scanner(System.in);

    questioner.askFirstNumber();
    double firstNumber = scanner.nextDouble();
    scanner.nextLine();

    questioner.askWhatToDo();
    String choice = scanner.nextLine();

    questioner.askSecondNumber();
    double secondNumber = scanner.nextDouble();

    switch (choice) {
        case "+" -> questioner.answer(counter.add(firstNumber, secondNumber));
        case "-" -> questioner.answer(counter.minus(firstNumber, secondNumber));
        case "*" -> questioner.answer(counter.multiply(firstNumber, secondNumber));
        case "/" -> questioner.answer(counter.divide(firstNumber, secondNumber));
    }


}
