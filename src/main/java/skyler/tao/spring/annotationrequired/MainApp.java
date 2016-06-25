package skyler.tao.spring.annotationrequired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chaoqiang on 16/6/13.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans3.xml");
        Student student = (Student)context.getBean("student");
        System.out.println(student.getAge());
        System.out.println(student.getName());
    }
}
