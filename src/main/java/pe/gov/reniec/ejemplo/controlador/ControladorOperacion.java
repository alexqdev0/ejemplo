package pe.gov.reniec.ejemplo.controlador;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/operaciones")
public class ControladorOperacion {

    @GetMapping("/sumar")
    @Operation(summary = "Suma dos números", description = "Devuelve la suma de dos números")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "400", description = "Parámetros inválidos")
    })
    public double sumar(@RequestParam double num1, @RequestParam double num2) {
        return num1 + num2;
    }

    @GetMapping("/restar")
    @Operation(summary = "Rests dos números", description = "Devuelve la resta de dos números")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "400", description = "Parámetros inválidos")
    })
    public double sumar(@RequestParam double num1, @RequestParam double num2) {
        return num1 - num2;
    }

}
