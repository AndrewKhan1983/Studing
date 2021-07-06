package lesson19;

public class TaskExecutorImpl extends Thread implements TaskExecutor {
    private TasksStorage storage;
    private boolean needstop = false;

    @Override
    public void setStorage(TasksStorage storage) throws NullPointerException {
        this.storage = storage;
    }

    @Override
    public TasksStorage getStorage() {
        return storage;
    }

    @Override
    public void run() {
        while (!needstop) {
            Task task = storage.get();
            if (task != null) {
                System.out.println(Thread.currentThread().getName() + " === начал выполнять задачу");
                try {
                    task.execute();
                    System.out.println(Thread.currentThread().getName() + " === задача выполнена успешно");
                } catch (TaskExecutionFailedException e) {
                    System.out.println(Thread.currentThread().getName() + " === не получается выполнить задачу");
                    if (task.getTryCount() < 5) {
                        task.incTryCount();
                        storage.add(task);
                        System.out.println(Thread.currentThread().getName() + " === возвращаем обратно");
                    } else {
                        System.out.println(Thread.currentThread().getName() + " === задача не выполнима удаляю ее");
                    }
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " === завершаю работу потому что нет задач");
                needstop = true;
            }
        }
    }
}
