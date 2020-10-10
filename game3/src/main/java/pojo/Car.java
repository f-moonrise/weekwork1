package pojo;

import org.springframework.stereotype.Component;

/**
 * @author zangye03@gmail.com
 * @date 2020/2/9 23:26
 */
@Component
public class Car {
    private String cname;
    private String color;
    private Integer price;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    Car(){}

    public Car(String cname, String color, Integer price) {
        this.cname = cname;
        this.color = color;
        this.price = price;
    }
}
