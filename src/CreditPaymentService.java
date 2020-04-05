public class CreditPaymentService {
    public double calculate (int amount, int period, double percent) {
        int periodMonth = period *12; // период в месяцах
        double rate = percent / 12 / 100; // ставка в месяц
     double payment = amount * (rate * Math.pow((1+rate),periodMonth)/(Math.pow((1+rate),periodMonth) -1));
     return payment;
    }
}
