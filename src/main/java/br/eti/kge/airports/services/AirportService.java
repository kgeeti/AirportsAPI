 /*
* _  ______        _____ _   _   ____       
* | |/ / ___| ___  | ____| |_(_) | __ ) _ __ 
* | ' / |  _ / _ \ |  _| | __| | |  _ \| '__|
* | . \ |_| |  __/_| |___| |_| |_| |_) | |   
* |_|\_\____|\___(_)_____|\__|_(_)____/|_|   
*
 */
package br.eti.kge.airports.services;

import br.eti.kge.airports.entities.Airport;
import br.eti.kge.airports.repositories.AirportRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Interage com os dados recebidos da camada de acesso a dados e mapeia-os para um DTO específico.
 * @author KGe
 */

@Service
public class AirportService {
    
    @Autowired
    private AirportRepository airportRepository;
    
    /**
     * Retorna DTO Airports (Completo - Todos os atributos).
     * @return 
     */
    public List<Airport> findAll() {
        
        List<Airport> result = airportRepository.findAll();
        return result;
        
    }
    
}

