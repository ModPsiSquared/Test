import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //assume the first argument is the name of a file

        if (args[0] == null) {
            System.out.println("File name is a required parameter");
        }

        String fileName = args[0];

        HashMap<Integer, WordMetrics> wordHashes = new HashMap<Integer, WordMetrics>();

        Scanner s = null;
        try {
            s = new Scanner(new BufferedReader(new FileReader(fileName))).useDelimiter("[\t .\r\n]");
            while (s.hasNext()) {
                String str = s.next();

                Integer hashCode = str.toLowerCase().hashCode();

                if (!wordHashes.containsKey(hashCode)) {
                    wordHashes.put(hashCode, new WordMetrics(str.toLowerCase(), 1));
                } else {
                    WordMetrics wm = wordHashes.get(hashCode);
                    wm.increment();

                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (s != null) {
                s.close();
            }
        }

        Set set = wordHashes.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            WordMetrics wm = (WordMetrics) entry.getValue();

            System.out.println(wm.Print());


        }

    }
}
