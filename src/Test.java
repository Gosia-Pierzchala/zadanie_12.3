import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) throws IOException {

        File file = new File("liczby.txt");
        file.createNewFile();

        TreeSet<Integer> set = new TreeSet<>();

        try{
            Scanner scan = new Scanner(file);
            while(scan.hasNextInt()){
            int liczba = scan.nextInt();
            set.add(liczba);
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

        Iterator <Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            Integer next = iterator.next();
            int iloscWystapien = Method.checkIfContains(next, file);
            System.out.println(next + " - liczba wystąpień: " + iloscWystapien);
        }
    }

}
