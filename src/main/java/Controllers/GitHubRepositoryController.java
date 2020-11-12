package Controllers;

import Entities.GitHubRepository;
import Services.GitHubRepositoryService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GitHubRepositoryController {


    @GetMapping(value = "/repositories")
    public
    ResponseEntity<?> objects (){

        System.out.println("czesć");
        List<String> objects = new ArrayList<String>();
        objects.add("Karol");
        objects.add("Artur");
        return ResponseEntity.ok(objects);
    }
}

