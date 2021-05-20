import java.util.ArrayList;
import java.util.List;


public class TaskManager {
	List<IProcesatorCerere> tasks = new ArrayList<>();
	String name;

	public TaskManager(String name) {
		super();
		this.name = name;
	}

	public void addAsyncTask(IProcesatorCerere task) {
		this.tasks.add(task);
	}

	public void doNextTask() {
		// determine the task with the biggest priority

		// round robin approach
		if (tasks.size() > 0) {
			IProcesatorCerere task = tasks.get(0);
			task.procesareCerere(tip, denumire);;
			tasks.remove(0);
		}
	}
}
