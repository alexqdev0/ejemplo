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

    @GetMapping("/potencia")
    @Operation(summary = "Potencia de un número", description = "Devuelve la potencia x de un determinado número")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operación exitosa"),
            @ApiResponse(responseCode = "400", description = "Parámetros inválidos")
    })
    public double potencia(@RequestParam double base, @RequestParam double exponente) {
        return Math.pow(base, exponente);
    }

    // Agrega los demás métodos (restar, multiplicar, dividir) de manera similar
}
