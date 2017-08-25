import service.ToDoService;
import service.impl.ToDoServiceImpl;

/**
 * Created by agurgul on 25.08.2017.
 */
public class Application {

    public static void main(String[] args) {

        ToDoService toDoService = new ToDoServiceImpl();
        System.out.println(toDoService.healthCheck());

//        toDoService.findAllTasksByUser("2").forEach(System.out::println);
//        TaskDTO taskDTO = toDoService.createNewTask("Nowa wartość", 1L, false);
//        System.out.println(taskDTO);
//        taskDTO.setValue("Po edycji");
//        System.out.println(toDoService.updateTask(taskDTO));
        System.out.println(toDoService.deleteTask(1L));
    }
}
