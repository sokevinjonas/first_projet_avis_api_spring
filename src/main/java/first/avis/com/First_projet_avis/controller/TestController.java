package first.avis.com.First_projet_avis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "test")
public class TestController {

    @GetMapping(path = "string")
    public String getString()
    {
        return "Ceci est mon test api";
    }
}
