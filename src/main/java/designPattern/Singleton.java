package designPattern;

public class Singleton implements Cloneable {

    private static Singleton singletonObj;

    private Singleton() {
    }

    public static Singleton getSingletonObj() {
        synchronized (Singleton.class) {
            if (singletonObj == null) {
                singletonObj = new Singleton();
            } else {
                return singletonObj;
            }
            return singletonObj;
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Singleton singletonObj1 = Singleton.getSingletonObj();
        Singleton singletonObj2 = (Singleton) singletonObj1.clone();

        System.out.println(singletonObj1.hashCode());
        System.out.println(singletonObj2.hashCode());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
