import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {

        File file = new File("liczby.txt");
        file.createNewFile();

        TreeMap<Integer, Integer> numbers = new TreeMap<>();

        try{
            Scanner scan = new Scanner(file);
            int iloscWystapien;
            while(scan.hasNextInt()){
            int liczba = scan.nextInt();
            if(numbers.containsKey(liczba)){
                iloscWystapien = numbers.get(liczba) + 1;
            } else {
                iloscWystapien = 1;
            }
            numbers.put(liczba, iloscWystapien);
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

        final Set<Integer> integers = numbers.keySet();
        final Collection<Integer> values = numbers.values();

        Iterator<Integer> iterator1 = integers.iterator();
        Iterator<Integer> iterator2 = values.iterator();

        while (iterator1.hasNext() && iterator2.hasNext()){
            Integer number1 = iterator1.next();
            Integer number2 = iterator2.next();
            System.out.println(number1 + " - liczba wystąpień: " + number2);
        }

    }
}
