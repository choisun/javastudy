package sun.javastudy.captured_variable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by sun on 2017-03-29.
 */
public class Run {

    public static void main(String[] args) {
        List<Dog> dogList = addDog();

        printDog(dogList);

        // 익명 클래스
        dogList.sort(new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return o1.compareTo(o2);
            }
        });

        // Lambda
        //dogList.sort((Dog o1, Dog o2) -> o1.compareTo(o2));

        System.out.println("======================정렬===================");

        printDog(dogList);
    }

    private static List<Dog> addDog() {
        List<Dog> dogList = new ArrayList<Dog>();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.setAge(3);
        dog1.setName("a");
        dog1.setSex("M");

        dog2.setAge(1);
        dog2.setName("b");
        dog2.setSex("M");

        dog3.setAge(5);
        dog3.setName("c");
        dog3.setSex("F");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);

        return dogList;
    }

    private static void printDog(List<Dog> dogList) {
        for (Dog dog : dogList) {
            System.out.println(dog.getName() + " : " + dog.getAge());
        }
    }
}
