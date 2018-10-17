import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class SortedSet {

    static ArrayList<Integer> lst = new ArrayList<Integer>();

    public static void createDataSet() throws FileNotFoundException {
        File file = new File("/Users/Andy/IdeaProjects/Sorted Set Lab/src/infile.dat");
        Scanner sc = new Scanner(file);
        int numToAdd=0;


        while (sc.hasNextLine()) {
            numToAdd = Integer.parseInt(sc.next());
            lst.add(numToAdd);
            System.out.println(lst);
        }
    }


    public static void isEmpty(){
        if (lst.isEmpty()){
            System.out.println("The data set is empty");
        }
    }

    public static void add(int value){
        lst.add(value);

    }

    public static void remove(int value){
        for (int i=0; i < lst.size();i++){
            if (lst.get(i)==value){
                lst.remove(i);
                break;
            }
        }

    }

    public static void contains(int value){

    }

    public void promptUser(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to search for in the data set: ");
        int input = in.nextInt();



    }

    public static void main(String arg[]) {
        try {
            createDataSet();
            isEmpty();
            add(8);
            System.out.println(lst);
            remove(8);
            System.out.println(lst);
        } catch ( IOException e ){
            e.printStackTrace();
            System.exit(1);
        }
    }
}
