import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Extensions
{
    public static <T> List<T> load(String fileName)
    {
        ArrayList<T> returnValue = null;
        try
        {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            returnValue = (ArrayList<T>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();

        } catch (IOException | ClassNotFoundException ioException)
        {
            System.out.println("no extension in file: " + fileName);
        }
        return returnValue;
    }

    public static <T> void save(List<T> list, String filename)
    {
        try
        {
            FileOutputStream fileOutputStream = new FileOutputStream(filename);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(list);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException ioException)
        {
            ioException.printStackTrace();
        }
    }
}
