package pojo;

import org.springframework.stereotype.Component;

/**
 * @author zangye03@gmail.com
 * @date 2020/2/9 23:25
 */
@Component
public class Users {
    private String uname;
    private Integer age;
    private Car c;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Car getC() {
        return c;
    }

    public void setC(Car c) {
        this.c = c;
    }

    Users(){

    }

    public Users(String uname, Integer age, Car c) {
        this.uname = uname;
        this.age = age;
        this.c = c;
    }
}
