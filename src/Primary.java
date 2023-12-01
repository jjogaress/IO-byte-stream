import java.io.*;

public class Primary {
    public static void main(String[] args) {
        int bait;

        try (FileInputStream fis = new FileInputStream("lab10.txt");
        FileOutputStream fos = new FileOutputStream("copylab10.txt"))
        {
            do {

                bait = fis.read();
                if((char)bait == ' ')bait = '-';
                if(bait != -1) fos.write(bait);
            }while (bait!= -1);
        } catch (IOException e){
            System.out.println("error IO");
        }

    }
}
