package client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/greeting")
    public String greeting(){
        return "Greeting!";
    }

    @GetMapping("/call-server")
    public String callServer(){
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://localhost:8080/greeting",String.class);
        return responseEntity.getBody();
    }
}
