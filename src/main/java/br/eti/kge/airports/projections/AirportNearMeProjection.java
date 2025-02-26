 /*
* _  ______        _____ _   _   ____       
* | |/ / ___| ___  | ____| |_(_) | __ ) _ __ 
* | ' / |  _ / _ \ |  _| | __| | |  _ \| '__|
* | . \ |_| |  __/_| |___| |_| |_| |_) | |   
* |_|\_\____|\___(_)_____|\__|_(_)____/|_|   
*
 */
package br.eti.kge.airports.projections;

/**
 * Interface para mapear os atributos da Query personalizada
 * criada em AirportRepositories.
 * @author KGe
 */

public interface AirportNearMeProjection {
    
   long getId();
   String getName();
   String getCity();
   String getIataCode();
   double getLatitude();
   double getLongitude();
   double getAltitude();
   double getDistanciaKM();
    
}

