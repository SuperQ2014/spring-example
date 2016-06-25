package skyler.tao.spring.javabasedannotation;

/**
 * Created by chaoqiang on 16/6/14.
 */
public class HelloWorld {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your message: " + message);
    }
}
