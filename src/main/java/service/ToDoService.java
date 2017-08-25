package service;

import dto.TaskDTO;

import java.util.List;

/**
 * Created by agurgul on 25.08.2017.
 */
public interface ToDoService {

    boolean healthCheck();
    List<TaskDTO> findAllTasksByUser(String userId);
    TaskDTO createNewTask(String value, Long userId, Boolean completed);
    TaskDTO updateTask(TaskDTO taskDTO);
    boolean deleteTask(Long id);

}
