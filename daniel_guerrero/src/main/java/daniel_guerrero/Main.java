// Copyright (C) 2020
// All rights reserved
package daniel_guerrero;

import java.util.HashSet;
import java.util.Scanner;

public class Main { //NOPMD
	private static final HashSet<String> VALID_DESTINATIONS = new HashSet<String>(); //NOPMD

    static {
        VALID_DESTINATIONS.add("Paris");
        VALID_DESTINATIONS.add("New York City");
        VALID_DESTINATIONS.add("Quito");
    }
    //CHECKSTYLE: OFF
    /**
     * funcion principal del programa
     */

    public static void main(String[] args) {
    //CHECKSTYLE: ON	
    	Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Vacation Package Calculator!");

        VacationPackageBuilder builder = new VacationPackageBuilder();

        // Get user input for destination
        String destination = getValidDestination(scanner);
        builder.setDestination(destination);

        // Get user input for number of travelers
        System.out.print("Enter the number of travelers: ");
        int numTravelers = scanner.nextInt();
        builder.setNumTravelers(numTravelers);

        // Get user input for duration of the vacation
        System.out.print("Enter the duration of the vacation in days: ");
        int duration = scanner.nextInt();
        builder.setDuration(duration);
        
        // Get user input for duration of the vacation
        System.out.print("1 All-Inclusive Package - $200 per traveler\r\n"
        		+ "2 Adventure Activities Package - $150 per traveler\r\n"
        		+ "3 Spa and Wellness Package - $100 per traveler\r\n Option:");
        int addons = scanner.nextInt();
        builder.setAddon(addons);
        
        VacationPackage vacationPackage = builder.build();

        int totalCost = VacationPackageCalculator.calculateTotalCost(vacationPackage);

        // Output the total cost or -1 if the input data is not valid
        if (totalCost >= 0) {
            System.out.println("Total cost of the vacation package: $" + totalCost);
        } else {
            System.out.println("Invalid input data. Total cost cannot be calculated.");
        }
    }
    
    /**
     * Solicita al usuario que ingrese el destino de la vacación y valida si el destino ingresado es válido.
     *
     * @param scanner El objeto Scanner utilizado para leer la entrada del usuario.
     * @return El destino válido ingresado por el usuario.
     */
    private static String getValidDestination(Scanner scanner) {
        String destination;
        while (true) {
            System.out.print("Enter the destination of the vacation: ");
            destination = scanner.nextLine();
            if (VALID_DESTINATIONS.contains(destination)) {
                break;
            }
            System.out.println("Invalid destination entered. Please enter another destination.");
        }
        return destination;
    }
}





