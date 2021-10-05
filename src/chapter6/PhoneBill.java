package chapter6;

public class PhoneBill {
    private int id;
    private double baseCost;
    private double allottedMinutes;
    private double minutesUsed;

    public PhoneBill() {
        id = 0;
        baseCost = 0;
        allottedMinutes = 0;
        minutesUsed = 0;
    }

    public PhoneBill(int id) {
        setId(id);
    }

    public PhoneBill(int id, double baseCost, double allottedMinutes, double minutesUsed) {
        setId(id);
        setBaseCost(baseCost);
        setAllottedMinutes(allottedMinutes);
        setMinutesUsed(minutesUsed);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public double getAllottedMinutes() {
        return allottedMinutes;
    }

    public void setAllottedMinutes(double allottedMinutes) {
        this.allottedMinutes = allottedMinutes;
    }

    public double getMinutesUsed() {
        return minutesUsed;
    }

    public void setMinutesUsed(double minutesUsed) {
        this.minutesUsed = minutesUsed;
    }

    public double calculateOverageCost() {
        double overageFee = 0.25;

        if(minutesUsed <= allottedMinutes) return 0;
        else return (minutesUsed - allottedMinutes) * overageFee;
    }

    public double taxCalculator() {
        return 0.15 * (baseCost + calculateOverageCost());
    }

    public double finalTotal() {
        double sum = baseCost + calculateOverageCost();
        return (sum + taxCalculator());
    }

    public void printItemizedBill(){
        System.out.println("ID: " + id);
        System.out.println("Base Rate: $" + baseCost);
        System.out.printf("%s%.2f%n", "Overage Fee: $", calculateOverageCost());
        System.out.printf("%s%.2f%n", "Tax: $", taxCalculator());
        System.out.printf("%s%.2f", "Total: $", finalTotal());
    }
}
