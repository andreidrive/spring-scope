package andrei.dev.service;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

@Component
public class JobRunnerSecond {
    private final ObjectProvider<TaskContext> taskContextProvider;

    public JobRunnerSecond(ObjectProvider<TaskContext> taskContextProvider) {
        this.taskContextProvider = taskContextProvider;
    }

    public void runOnce() {
        TaskContext taskContext = taskContextProvider.getObject();
        System.out.println("diff id: " + taskContext.id());
    }
}
