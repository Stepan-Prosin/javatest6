public class CreditPaymentService {
    public int calculate(double credit, double rate, int years) {
        int month = years * 12;
        double monthrate = rate / 12 / 100;
        int monthpay = (int) (credit * (monthrate * Math.pow((1 + monthrate), month)) / (-1 + Math.pow((1 + monthrate), month)));
        return monthpay;
    }
}