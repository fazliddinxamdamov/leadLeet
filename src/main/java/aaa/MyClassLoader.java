package aaa;

public class MyClassLoader extends ClassLoader{

    protected Class<?> findClass (String name) throws ClassNotFoundException {
        System.out.println("MyClassLoader start: " + name);

        try {

            return super.loadClass(name);

        } catch (ClassNotFoundException e) {
            throw new ClassNotFoundException(name + " not found");
        }
    }
}
