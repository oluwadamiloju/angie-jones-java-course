package chapter5;

/*
Phone Bill Calculator
Calculate the final total of someone's cell phone bill.
Allow the operator's to input the plan fee and the number of overage minutes
Charge the user 0.25 for every minute they were over their plan, and 15% tax
on the subtotal
Create separate methods to calculate the tax, overage fees, and final total.
Print the itemized bill
 */

import java.util.Scanner;

public class PhoneBillCalculator {
    static double overageFee = 0.25;

    public static double overageFees(double overageMinutes) {
        return overageFee * overageMinutes;
    }

    public static double taxCalculator(double baseCost, double overageCost) {
        return 0.15 * (baseCost + overageCost);
    }

    public static void finalTotal(double sum, double tax){
        System.out.printf("%s%.2f", "Total: $", (sum + tax));
    }

    public static void main(String[] args) {
        System.out.println("Enter base cost of plan:");
        Scanner scanner = new Scanner(System.in);
        double baseCost = scanner.nextDouble();

        System.out.println("Enter overage minutes:");
        double overageMinutes = scanner.nextDouble();

        double overageCost = overageFees(overageMinutes);

        double sum = baseCost + overageCost;

        double tax = taxCalculator(baseCost, overageCost);

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + baseCost);
        System.out.println("Overage: $" + overageCost);
        System.out.printf("%s%.2f%n", "Tax: $", tax);
        finalTotal(sum, tax);
    }
}
