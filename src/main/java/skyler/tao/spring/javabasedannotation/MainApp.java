package skyler.tao.spring.javabasedannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by chaoqiang on 16/6/14.
 */
public class MainApp {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        HelloWorld helloWorld = context.getBean(HelloWorld.class);
        helloWorld.setMessage("skyler tao");
        helloWorld.getMessage();
    }
}
