import java.io.*;

public class TestDataStream {
    public static void main(String[] args) {
        try {
            DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"));
            output.writeUTF("john");
            output.writeDouble(85.5);
            output.writeUTF("susab");
            output.writeDouble(185.5);
            output.writeUTF("kim");
            output.writeDouble(105.25);
            output.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"));
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + "" + input.readDouble());
            input.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}