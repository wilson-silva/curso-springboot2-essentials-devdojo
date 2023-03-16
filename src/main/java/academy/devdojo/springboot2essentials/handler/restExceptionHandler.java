package academy.devdojo.springboot2essentials.handler;

import academy.devdojo.springboot2essentials.exception.BadRequestException;
import academy.devdojo.springboot2essentials.exception.BadRequestExceptionDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class restExceptionHandler {
    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<BadRequestExceptionDetails> handlerBadRequestException(BadRequestException bre){
        return new ResponseEntity<>(
            BadRequestExceptionDetails.builder()
                    .timestamp(LocalDateTime.now())
                    .status(HttpStatus.BAD_REQUEST.value())
                    .title("Bad Request Exception, Check the documentation")
                    .details(bre.getMessage())
                    .developerMessage(bre.getClass().getName())
                    .build(), HttpStatus.BAD_REQUEST);
    }
}
