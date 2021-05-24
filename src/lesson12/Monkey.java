package lesson12;

public class Monkey implements ZooAnimal{
    @Override
    public void voice() {
        System.out.println("УУУУУ");
    }

    @Override
    public void jump() {
        System.out.println("Обезьяна прыгает");
    }

    @Override
    public void run() {
        System.out.println("Обезьяна бегает");
    }
}
