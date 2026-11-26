
package gepar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping("/api/status")
    public String verificarStatus() {
        return "API do GEPAR está funcionando!";
    }
}
