package service.impl;

import dto.TaskDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import service.ToDoService;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by agurgul on 25.08.2017.
 */
public class ToDoServiceImpl implements ToDoService {

    private RestTemplate restTemplate;
    private String baseUrl = "https://shrouded-fjord-81597.herokuapp.com/api";

    public ToDoServiceImpl() {
        restTemplate = new RestTemplate();
    }

    public boolean healthCheck() {

        ResponseEntity<String> responseEntity = restTemplate.getForEntity(baseUrl + "/health-check", String.class);
        return responseEntity.getStatusCode() == HttpStatus.OK;
    }

    public List<TaskDTO> findAllTasksByUser(String userId) {

        ResponseEntity<TaskDTO[]> response = restTemplate.getForEntity(baseUrl + "/task/all/" + userId, TaskDTO[].class);
        return asList(response.getBody());
    }
}
