package sun.javastudy.default_method;

/**
 * Created by sun on 2017-04-08.
 */
public class PersonImpl implements Person {

    @Override
    public String getName() {
        return "sun";
    }

    @Override
    public String getGender() {
        return "F";
    }
}
