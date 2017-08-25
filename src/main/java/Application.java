import service.ToDoService;
import service.impl.ToDoServiceImpl;

/**
 * Created by agurgul on 25.08.2017.
 */
public class Application {

    public static void main(String[] args) {

        ToDoService toDoService = new ToDoServiceImpl();
        System.out.println(toDoService.healthCheck());

        toDoService.findAllTasksByUser("2").forEach(System.out::println);
    }
}
