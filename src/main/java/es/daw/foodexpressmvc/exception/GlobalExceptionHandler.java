package es.daw.foodexpressmvc.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends RuntimeException {
    @ExceptionHandler(ConnectionApiRestException.class)
    public String handleConnectionApiRestException(ConnectionApiRestException e, Model model) {

        model.addAttribute("errorMessage", e.getMessage());

        return "api-error";
    }
}
