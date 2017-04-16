package sun.javastudy.default_method;

/**
 * Created by sun on 2017-04-08.
 */
public class Run {
    public static void main(String[] args) {
        Person person = new PersonImpl();

        System.out.println(person.getName());
        System.out.println(person.getGender());
    }
}
