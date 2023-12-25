import java.io.*;

public class Copy {
    public static void main(String[] args) {
        if (args.length !=2){
            System.out.println("Usage: java Copy sourceFile targetfile");
            System.exit(1);

        }
        File sourceFile=new File(args[0]);
     if(!sourceFile.exists()){
         System.out.println("source file " + args[1] + "already exists");
         System.exit(2);

     }
     File targetFile =new File(args[1]);
     if(targetFile.exists()){
         System.out.println("target file" + args[1] + "already exists");
         System.exit(3);
     }
     try{
         BufferedInputStream input=new BufferedInputStream(new FileInputStream(sourceFile));
         BufferedOutputStream output=new BufferedOutputStream(new FileOutputStream(targetFile));
         int r , numberOfBytesCopied=0;
         while ((r=input.read()) !=-1){
             output.write((byte)r);
             numberOfBytesCopied++;

         }
         System.out.println(numberOfBytesCopied + "byte copied");

     } catch (FileNotFoundException e) {
         throw new RuntimeException(e);
     } catch (IOException e) {
         throw new RuntimeException(e);
     }
    }
}
