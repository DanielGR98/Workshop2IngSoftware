// Copyright (C) 2020
// All rights reserved
package daniel_guerrero;
public class VacationPackage {
	final private String destination;
    final private int numTravelers;
    final private int duration;
    final private int addon;
    /**
     * Constructor de la clase VacationPackage.
     * @param destination   El destino de la vacación.
     * @param numTravelers  El número de viajeros.
     * @param duration      La duración de la vacación en días.
     */
    public VacationPackage(String destination, int numTravelers, int duration, int addon) {
        this.destination = destination;
        this.numTravelers = numTravelers;
        this.duration = duration;
        this.addon = addon;
    }

    public String getDestination() {
        return destination;
    }

    public int getNumTravelers() {
        return numTravelers;
    }

    public int getDuration() {
        return duration;
    }
    
    public int getAddon() {
    	return addon;
    }
}

