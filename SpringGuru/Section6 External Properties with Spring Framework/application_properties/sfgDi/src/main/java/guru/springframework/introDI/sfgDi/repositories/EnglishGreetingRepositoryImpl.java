package guru.springframework.introDI.sfgDi.repositories;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
    @Override
    public String getGreeting() {
        return "Hello World! - EN2222222";
    }
}
