package andrei.dev.service;

import org.springframework.stereotype.Component;

@Component
public class JobRunner {
    private final TaskContext taskContext;

    public JobRunner(TaskContext taskContext) {
        this.taskContext = taskContext;
    }

    public void runOnce() {
        System.out.println("id: " + taskContext.id());
    }
}
