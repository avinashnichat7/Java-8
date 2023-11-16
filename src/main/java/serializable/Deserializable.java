package serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Student student =   new Student();

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\user\\Desktop\\Serializable.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Student readObject = (Student) objectInputStream.readObject();

        System.out.println(readObject.getName());
        System.out.println(readObject.getCity());
        System.out.println(readObject.getAge());
        System.out.println(readObject.getAddress());

    }
}
