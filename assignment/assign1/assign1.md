# Driving Cost Calculator - CS1410 Assignment 1

## Assignment Overview

In this assignment, you will create a program to calculate the driving cost of a trip for both a gas vehicle and an electric vehicle. This exercise will help you practice:

- Setting up a project and writing code in Eclipse
- Breaking a problem into smaller pieces
- Using meaningful variable names for clarity

The program will calculate and compare the energy cost of a trip for both types of vehicles, taking into account their fuel efficiency and the cost of fuel or electricity.

## Getting Started

1. **Set up your environment**:
   - Install Eclipse if you haven't already (refer to the Canvas announcement for installation instructions).
   - Create a new Java project in Eclipse named `CS1410-Assignments`. Use **JavaSE-11** for this project.
   - Inside your project, create a new package named `a1`.
   - In the `a1` package, create a new class called `DrivingCostCalculator` and make sure to check the box to automatically create a `main` method.

2. **Create the following methods**:
   - **Main Method**: This method will call other methods to calculate costs and display results.
   - **Gas Vehicle Trip Cost Method**: Calculates the cost for a gas vehicle.
   - **Electric Vehicle Trip Cost Method**: Calculates the cost for an electric vehicle.
   - **Banner Method**: Displays a text banner at the beginning of the program.

## Method Specifications

### Main Method
- Declare and initialize variables to store:
  - Driving distance (miles)
  - Gas vehicle's miles per gallon (mpg)
  - Cost of gas (dollars per gallon)
  - Electric vehicle's miles per kilowatt-hour (kWh)
  - Cost of electricity (dollars per kWh)
  
- Call the **calculateGasTripCost** and **calculateElectricTripCost** methods to compute the cost for each vehicle type.
- Call the **displayBanner** method to show a banner at the start.
- Output the calculated costs to the console, formatted to two decimal places using `String.format`.

### Gas Vehicle Trip Cost Method
- Write a method `calculateGasTripCost(double milesToDrive, double milesPerGallon, double dollarsPerGallon)` to calculate the trip cost for a gas vehicle.
  - The cost is calculated using the formula:
    ``` 
    cost = (miles / milesPerGallon) * dollarsPerGallon
    ```
  - First, calculate the number of gallons used (`miles / milesPerGallon`), then compute the cost by multiplying by `dollarsPerGallon`.

### Electric Vehicle Trip Cost Method
- Write a method `calculateElectricTripCost(double milesToDrive, double milesPerKWh, double dollarsPerKWh)` to calculate the trip cost for an electric vehicle.
  - The cost is calculated using the formula:
    ```
    cost = (miles / milesPerKWh) * dollarsPerKWh
    ```
  - First, calculate the number of kilowatt-hours needed (`miles / milesPerKWh`), then compute the cost by multiplying by `dollarsPerKWh`.

### Banner Method
- Write a method `displayBanner()` that prints a decorative text banner with the title and program name. The banner should look like:
