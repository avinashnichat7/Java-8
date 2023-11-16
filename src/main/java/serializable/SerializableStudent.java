package serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableStudent {
    public static void main(String[] args) throws IOException {


        Student student = new Student();

        student.setName("Avinash");
        student.setCity("Ngp");
        student.setAge(20);
        student.setAddress("Maharashtra");
        ObjectOutputStream outputStream = null;
        FileOutputStream fileOutputStream=null;
        try {
            fileOutputStream = new FileOutputStream("C:\\Users\\user\\Desktop\\Serializable.txt");
            outputStream = new ObjectOutputStream(fileOutputStream);

            outputStream.writeObject(student);


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            outputStream.close();
            fileOutputStream.close();

        }
    }
}
