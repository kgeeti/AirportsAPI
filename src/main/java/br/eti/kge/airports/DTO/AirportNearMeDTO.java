/*
* _  ______        _____ _   _   ____       
* | |/ / ___| ___  | ____| |_(_) | __ ) _ __ 
* | ' / |  _ / _ \ |  _| | __| | |  _ \| '__|
* | . \ |_| |  __/_| |___| |_| |_| |_) | |   
* |_|\_\____|\___(_)_____|\__|_(_)____/|_|   
*
 */
package br.eti.kge.airports.DTO;

import br.eti.kge.airports.projections.AirportNearMeProjection;

/**
 * Classe para representar um pequeno conjunto de dados de Airport
 * exclusiva para retorno dos aeroportos próximos ao ponto informado.
 * Utilizada apenas como DTO (Data Transfer Object)
 * @author KGe
 */
public class AirportNearMeDTO {

    private long id;
    private String name;
    private String city;
    private String iataCode;
    private double latitude;
    private double longitude;
    private double altitude;
    private double distanciaKM;

    public AirportNearMeDTO() {
    }

    /**
     * Construtor
     * Recebe uma interface AirportNearMeProjection como parâmetro
     * e mapeia para um AirportNearMeDTO objeto.
     * @param airportProjection 
     */
    public AirportNearMeDTO(AirportNearMeProjection airportProjection) {
        this.id = airportProjection.getId();
        this.name = airportProjection.getName();
        this.city = airportProjection.getCity();
        this.iataCode = airportProjection.getIataCode();
        this.latitude = airportProjection.getLatitude();
        this.longitude = airportProjection.getLongitude();
        this.altitude = airportProjection.getAltitude();
        this.distanciaKM = airportProjection.getDistanciaKM();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getIataCode() {
        return iataCode;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getAltitude() {
        return altitude;
    }

    public double getDistanciaKM() {
        return distanciaKM;
    }
    
    
    
    
}

