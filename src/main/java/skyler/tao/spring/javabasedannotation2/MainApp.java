package skyler.tao.spring.javabasedannotation2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by chaoqiang on 16/6/14.
 */
public class MainApp {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(TextEditorConfig.class);
        TextEditor textEditor = context.getBean(TextEditor.class);
        textEditor.spellCheck();
    }
}
