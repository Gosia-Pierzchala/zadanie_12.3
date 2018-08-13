import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Method {

    public static int checkIfContains(Integer x, File file){
        int j = 0;
        try{
            Scanner scan = new Scanner(file);
            while(scan.hasNextInt()){
                int liczba = scan.nextInt();
                Integer num = liczba;
                if(x.equals(num)){
                    j++;
                }
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return j;
    }

}
