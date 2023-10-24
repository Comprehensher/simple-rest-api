package eu.eRest.ErestApp.controllers.handler;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class PeopleControllerHandler {

    @ExceptionHandler({Exception.class})
    public ResponseEntity<Object> handleErrorAtServer(Exception e,
                                                      WebRequest webRequest) {
        return new ResponseEntity<Object>(e.getMessage(), new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
