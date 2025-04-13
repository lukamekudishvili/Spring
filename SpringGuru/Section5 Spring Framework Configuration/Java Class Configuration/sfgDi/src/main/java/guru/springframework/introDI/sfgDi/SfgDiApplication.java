package guru.springframework.introDI.sfgDi;

import guru.springframework.introDI.sfgDi.controllers.*;
import guru.springframework.introDI.sfgDi.datasources.FakeDataSource;
import guru.springframework.introDI.sfgDi.services.PrototypeBean;
import guru.springframework.introDI.sfgDi.services.SingletonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.springframework.pets","guru.springframework.introDI.sfgDI"})
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx=SpringApplication.run(SfgDiApplication.class, args);




		System.out.println("----------------- Property");
		PropertyInjectedController propertyInjectedController=
				(PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());


		System.out.println("----------------- Setter");
		SetterInjectedController setterInjectedController=
				(SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());


		System.out.println("----------------- Constructor");
		ConstructorInjectedController constructorInjectedController
				=(ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

		System.out.println();
		System.out.println("----------------------------------------------------");
		System.out.println();

		MyController myController=(MyController) ctx.getBean("myController");
		System.out.println(myController.getGreeting());

		System.out.println();
		System.out.println("----------------------------------------------------");
		System.out.println();

		I18nController i18nController=(I18nController)ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		System.out.println();
		System.out.println("----------------------------------------------------");
		System.out.println();

		PetController petController=(PetController) ctx.getBean("petController");
		System.out.println(petController.whichPetIsTheBest());


		System.out.println();
		System.out.println("----------------------------------------------------");
		System.out.println();


		SingletonBean singletonBean1=ctx.getBean(SingletonBean.class);
		SingletonBean singletonBean2=ctx.getBean(SingletonBean.class);
		System.out.printf("Singleton: singletonBean1==singletonBean2 -> %s%n",
				singletonBean1==singletonBean2?"true":"false");
		System.out.println("singletonBean1: "+singletonBean1.hashCode());
		System.out.println("singletonBean2: "+singletonBean2.hashCode());


		System.out.println("----------------------------------------------------");


		PrototypeBean prototypeBean1=ctx.getBean(PrototypeBean.class);
		PrototypeBean prototypeBean2=ctx.getBean(PrototypeBean.class);
		System.out.printf("Prototype: prototypeBean1==prototypeBean2 -> %s%n",
				prototypeBean1==prototypeBean2?"true":"false");
		System.out.println("prototypeBean1: "+prototypeBean1.hashCode());
		System.out.println("prototypeBean2: "+prototypeBean2.hashCode());



		System.out.println();
		System.out.println("----------------------------------------------------");
		System.out.println();

		FakeDataSource fakeDataSource=(FakeDataSource) ctx.getBean("fakeDataSource");
		System.out.println("username: "+fakeDataSource.getUsername());
		System.out.println("password: "+fakeDataSource.getPassword());
		System.out.println("JDBC URL: "+fakeDataSource.getJdbcurl());
	}

}
