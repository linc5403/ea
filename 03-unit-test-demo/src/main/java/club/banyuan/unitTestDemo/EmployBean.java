package club.banyuan.unitTestDemo;

import lombok.Data;

@Data
public class EmployBean {
    private String name;
    private Integer age;
    private Integer id;

    public EmployBean(String name, Integer age, Integer id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public EmployBean() {
    }
}
