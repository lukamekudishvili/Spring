import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Status.Running.name());
        System.out.println(Status.Running);

        System.out.println(Arrays.toString(Laptop.values()));
    }
}