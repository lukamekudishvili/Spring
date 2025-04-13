package guru.springframework.introDI.sfgDi.services;

public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World! - Constructor";
    }
}
