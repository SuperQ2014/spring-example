package skyler.tao.spring.annotationrequired;

import org.springframework.beans.factory.annotation.Required;

/**
 * Created by chaoqiang on 16/6/13.
 */
public class Student {
    private Integer age;
    private String name;

    @Required
    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
