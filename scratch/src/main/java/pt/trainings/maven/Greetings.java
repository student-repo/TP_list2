package pt.trainings.maven;

/**
 * Created by ubuntu-master on 28.10.16.
 */
public class Greetings {
    private static final String GREETING = "Hello ";

    public String  sayHello(String string) {
        return GREETING + (string != null ? string : "Jonh Doe");
    }
}
