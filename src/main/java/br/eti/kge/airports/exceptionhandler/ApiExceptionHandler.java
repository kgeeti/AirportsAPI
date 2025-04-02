 /*
* _  ______        _____ _   _   ____       
* | |/ / ___| ___  | ____| |_(_) | __ ) _ __ 
* | ' / |  _ / _ \ |  _| | __| | |  _ \| '__|
* | . \ |_| |  __/_| |___| |_| |_| |_) | |   
* |_|\_\____|\___(_)_____|\__|_(_)____/|_|   
*
 */
package br.eti.kge.airports.exceptionhandler;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * Só de implementar essa classe o texto de erro foi mitigado.
 * @author KGe
 */

//@ControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {

    // TODO: implementar o override para tratamento personalizado.
    
//    @Override
//    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
//        
//        System.out.println(ex.toString());
//        
//        return super.handleMethodArgumentNotValid(ex, headers, status, request); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
//    }
    
    
    
}
