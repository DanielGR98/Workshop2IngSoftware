// Copyright (C) 2020
// All rights reserved
package daniel_guerrero;

public class VacationPackageBuilder {
	private String destination;
    private int numTravelers;
    private int duration;
    private int addon;
    
    /**
     * Establece el destino de la vacación.
     *
     * @param destination El destino de la vacación.
     * @return El propio objeto VacationPackageBuilder para permitir el encadenamiento de llamadas.
     */
    public VacationPackageBuilder setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    
    /**
     * Establece el número de viajeros.
     *
     * @param numTravelers El número de viajeros.
     * @return El propio objeto VacationPackageBuilder para permitir el encadenamiento de llamadas.
     */
    public VacationPackageBuilder setNumTravelers(int numTravelers) {
        this.numTravelers = numTravelers;
        return this;
    }
    
    /**
     * Establece la duración de la vacación.
     *
     * @param duration La duración de la vacación en días.
     * @return El propio objeto VacationPackageBuilder para permitir el encadenamiento de llamadas.
     */
    public VacationPackageBuilder setDuration(int duration) {
        this.duration = duration;
        return this;
    }
    
    /**
     * Establece tipo de paquete para el viaje.
     *
     * @param addon Tipo de paquete de viaje.
     * @return El propio objeto VacationPackageBuilder para permitir el encadenamiento de llamadas.
     */
    public VacationPackageBuilder setAddon(int addon) {
        this.addon = addon;
        return this;
    }
    /**
     * Construye y devuelve un objeto de la clase VacationPackage con los valores especificados.
     *
     * @return Un objeto de la clase VacationPackage con los valores de los atributos destination, numTravelers y duration.
     */
    public VacationPackage build() {
        return new VacationPackage(destination, numTravelers, duration, addon);
    }
}
