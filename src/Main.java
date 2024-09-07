import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader reader = null;
        try {
             reader= new BufferedReader(new FileReader("C:\\Users\\90505\\IdeaProjects\\exceptionHandling\\src\\sayilar.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
                reader.close();
            }
        }
    }
    }
