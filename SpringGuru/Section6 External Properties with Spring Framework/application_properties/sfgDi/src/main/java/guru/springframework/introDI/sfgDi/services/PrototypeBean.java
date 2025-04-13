package guru.springframework.introDI.sfgDi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
//or
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeBean {
    public PrototypeBean() {
        System.out.println("Creating a Prototype Bean!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println(this.hashCode());
    }

    public String getMyScope(){
        return "I'm a Singleton";
    }

}
