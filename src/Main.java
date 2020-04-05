public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int payment1year = (int) (service.calculate(1_000_000, 1, 9.99));
        System.out.println(payment1year);
        int payment2years = (int) (service.calculate(1_000_000, 2, 9.99));
        System.out.println(payment2years);
        int payment3years = (int) (service.calculate(1_000_000, 3, 9.99));
        System.out.println(payment3years);
    }
}
