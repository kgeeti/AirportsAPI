/*
* _  ______        _____ _   _   ____       
* | |/ / ___| ___  | ____| |_(_) | __ ) _ __ 
* | ' / |  _ / _ \ |  _| | __| | |  _ \| '__|
* | . \ |_| |  __/_| |___| |_| |_| |_) | |   
* |_|\_\____|\___(_)_____|\__|_(_)____/|_|   
*
 */
package br.eti.kge.airports.controllers;

import br.eti.kge.airports.DTO.AirportMinDTO;
import br.eti.kge.airports.entities.Airport;
import br.eti.kge.airports.services.AirportService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller de Airports
 * Implementa os Endpoints planejados na documentação.
 * Utiliza o serviço AirportService
 *
 * @author KGe
 */
@RestController
public class AirportController {

    @Autowired
    private AirportService airportService;

    /**
     * Endpoint /airports/airport
     * Retorna TODOS os aeroportos da base de dados.
     *
     * @return
     */
    @GetMapping("/airport")
    @CrossOrigin
    public List<Airport> findAll() {
        List<Airport> result = airportService.findAll();
        return result;
    }

    /**
     * Endpoint /airports/city/{cityName}
     * preparado para devolver código de status conforme
     * padronização REST.
     *
     * @param cityName
     * @return
     */
    @GetMapping("/city/{cityName}")
    public ResponseEntity<List<Airport>> findByCityIgnoreCase(@PathVariable String cityName) {
        List<Airport> result = airportService.findByCity(cityName);

        if (result.isEmpty()) {
            // Ops.. lista vazia...
            // notFound devolve 404
            return ResponseEntity.notFound().build();

        } else {
            // Eba! Tem dados!
            // ok devolve 200
            return ResponseEntity.ok(result);
        }

    }

    /**
     * Endpoint /airports/country/{countryName}
     * preparado para devolver apenas os dados básicos solicitados no escopo
     * id, nome do aeroporto, cidade e IATA.
     * 
     * 
     * @param countryName
     * @return 
     */
    @GetMapping("/country/{countryName}")
    public ResponseEntity<List<AirportMinDTO>> findByCountryIgnoreCase(@PathVariable String countryName) {

        List<AirportMinDTO> result = airportService.findByCountry(countryName);
        if (result.isEmpty()) {
            // Ops.. lista vazia...
            // notFound devolve 404
            return ResponseEntity.notFound().build();

        } else {
            // Eba! Tem dados!
            // ok devolve 200
            return ResponseEntity.ok(result);
        }
    }
    
    
    /**
     * Endpoint /airports/iatacode/{iataCode}
     * Devolve os dados de um determinado aeroporto com base no seu IataCode
     * 
     * 
     * @param iataCode
     * @return 
     */
    @GetMapping("/iatacode/{iataCode}")
    public ResponseEntity<Airport> findByIataCode(@PathVariable String iataCode) {
        Airport result = airportService.findByIataCode(iataCode);

        if (result == null) {
            // Ops.. Aeroporto vazio...
            // notFound devolve 404
            return ResponseEntity.notFound().build();

        } else {
            // Eba! Tem dados!
            // ok devolve 200
            return ResponseEntity.ok(result);
        }

    }

}


