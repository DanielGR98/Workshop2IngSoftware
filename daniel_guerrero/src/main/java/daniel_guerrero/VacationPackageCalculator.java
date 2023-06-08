// Copyright (C) 2020
// All rights reserved
package daniel_guerrero;

public class VacationPackageCalculator { //NOPMD
	/**
	 * Calcula el costo total de un paquete de vacaciones.
	 *
	 * @param vacationPackage El objeto VacationPackage que contiene la información del paquete de vacaciones.
	 * @return El costo total del paquete de vacaciones, o -1 si los datos no son válidos.
	 */
	public static int calculateTotalCost(VacationPackage vacationPackage) {
        String destination = vacationPackage.getDestination();
        int numTravelers = vacationPackage.getNumTravelers();
        int duration = vacationPackage.getDuration();
        int addon = vacationPackage.getAddon();
        int baseCost = 1000;
        int additionalCost = 0;

        if ("Paris".equalsIgnoreCase(destination)) {
            additionalCost = 500;
        } else if ("New York City".equalsIgnoreCase(destination)) {
            additionalCost = 600;
        } else if (destination.equalsIgnoreCase(destination)) {
        	
        } else {
            return -1; // Invalid destination entered
        }

        int totalCost = baseCost + additionalCost;

        if (numTravelers > 4 && numTravelers < 10) {
            totalCost -= totalCost * 0.1;
        } else if (numTravelers > 10) {  //NOPMD
            totalCost -= totalCost * 0.2;
        }

        if (duration < 7) { //NOPMD
            totalCost += 200;
        }

        if (duration > 30 || numTravelers == 2) {
            totalCost -= 200;
        }

        if (numTravelers > 80) { //NOPMD
            return -1; // Vacation package not available for groups of more than 80 persons
        }
        if( addon == 1) { //NOPMD
        	totalCost += (200*numTravelers);
        } else if (addon == 2) { //NOPMD
        	totalCost += (150*numTravelers);
        } else if (addon == 3) { //NOPMD
        	totalCost += (100*numTravelers);
        }
        return totalCost;
    }
}
