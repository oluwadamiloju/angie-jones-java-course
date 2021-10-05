package chapter6;

public class MyPhoneBill {
    public static void main(String[] args) {
        PhoneBill phoneBill = new PhoneBill(1, 82.45, 500, 1000);
        phoneBill.printItemizedBill();
    }
}
