public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double credit = 1000000;
        double rate = 9.99;
        int month = service.calculate(credit, rate, 1);
        System.out.println(month);
        month = service.calculate(credit, rate, 2);
        System.out.println(month);
        month = service.calculate(credit, rate, 3);
        System.out.println(month);
    }
}