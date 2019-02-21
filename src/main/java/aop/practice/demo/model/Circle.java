package aop.practice.demo.model;

public class Circle {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("setted by setName");
        throw new RuntimeException("exception");
    }

    public String setNameAndReturn(String name) {
        this.name = name;
        System.out.println("setted by setNameAndReturn");
        return name + " stupid";
    }


}
