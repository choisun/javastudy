package sun.javastudy.captured_variable;

import java.util.Comparator;

/**
 * Created by sun on 2017-03-29.
 */
public class Dog implements Comparable {

    private String name;
    private String sex;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public int compareTo(Object o) {
        Dog dog = (Dog) o;

        if (this.getAge() > dog.getAge())
            return 1;
        else if (this.getAge() < dog.getAge())
            return -1;
        else
            return 0;

    }
}
