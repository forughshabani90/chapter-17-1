import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TestRandomAccessFile {
    public static void main(String[] args) {
        try {
            RandomAccessFile inout = new RandomAccessFile("input.dat", "rw");
            inout.setLength(0);
            for (int i = 0; i < 200; i++) {
                inout.writeInt(i);
                System.out.println("Current file lenght is" + inout.length());
                inout.seek(0);
                System.out.println("the first number is" + inout.readInt());
                inout.seek(1 * 4);
                System.out.println("the second number is  " + inout.readInt());
                inout.seek(9 * 4);
                System.out.println("the tenth number is" + inout.readInt());
                inout.writeInt(555);
                inout.seek(inout.length());
                inout.writeInt(999);
                System.out.println("the new lenght is" + inout.length());
                inout.seek(10 * 4);
                System.out.println("the elevent number is " + inout.readInt());


            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
