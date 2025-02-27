package assignment.assign1;

public class DrivingCostCalculator {
    public static void main(String args[]) {
        double drivingDistance = 100;
        double gasMiles = 10;
        double gasCost = 2;
        double electricMiles = 20;
        double electricCost = 5;

        double gasTripCost = calculateGasTripCost(drivingDistance, gasMiles, gasCost);
        double electricTripCost = calculateElectricTripCost(drivingDistance, electricMiles, electricCost);

        System.out.println("The cost of a " + drivingDistance + " mile trip by gas is $" + String.format("%.2f", gasTripCost) + " and by electric is $" + String.format("%.2f", electricTripCost) + ".") ;
    }

    public static double calculateGasTripCost(double milesToDrive, double milesPerGallon, double dollarsPerGallon) {
        return milesToDrive * dollarsPerGallon / milesPerGallon;
    }

    public static double calculateElectricTripCost(double milesToDrive, double milesPerKWh, double dollarsPerKWh) {
        return milesToDrive * dollarsPerKWh / milesPerKWh;
    }

    public static void displayBanner() {
        System.out.println("*****************************************");
        System.out.println("*       Driving Cost Calculator         *");
        System.out.println("*****************************************");
    }

}
