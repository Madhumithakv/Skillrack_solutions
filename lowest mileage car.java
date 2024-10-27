import java.util.Scanner;

public class LowestMileageCar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the entire input line
        String input = scanner.nextLine();

        // Split the input into individual car data based on space
        String[] cars = input.split(" ");

        // Initialize variables to store the car with the lowest mileage
        String lowestMileageCar = "";
        double lowestMileage = Double.MAX_VALUE;

        // Loop through each car's information
        for (String car : cars) {
            // Split the car's data into name and mileage using '@'
            String[] carData = car.split("@");
            String carName = carData[0];
            double carMileage = Double.parseDouble(carData[1]);

            // Check if the current car's mileage is lower than the stored lowest mileage
            if (carMileage < lowestMileage) {
                lowestMileage = carMileage;
                lowestMileageCar = carName;
            }
        }

        // Print the name of the car with the lowest mileage
        System.out.println(lowestMileageCar);

        // Close the scanner
        scanner.close();
    }
}
