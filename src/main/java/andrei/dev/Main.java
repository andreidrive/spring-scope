package andrei.dev;

import andrei.dev.service.JobRunner;
import andrei.dev.service.JobRunnerSecond;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("andrei.dev.service");

        JobRunner jobRunner = context.getBean(JobRunner.class);
        JobRunnerSecond jobRunnerSecond = context.getBean(JobRunnerSecond.class);

        jobRunner.runOnce();
        jobRunner.runOnce();

        jobRunnerSecond.runOnce();
        jobRunnerSecond.runOnce();
    }
}