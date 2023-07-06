package hw4;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class hw4
{
    public static void main(String[] args) throws IOException {
        ArrayList<String> family = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> soname = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Boolean> gender = new ArrayList<>();
        LinkedList<Integer> index = new LinkedList<>();


        String text = " ";
        FileReader reader = new FileReader("name.sql");
        while (reader.ready()) {
            text += (char) reader.read();
        }
        reader.close();
        String[] str = text.split("\r\n");
        for (int i = 1; i < str.length; i++) {
            String[] sb = str[i].split(" ");

            family.add(sb[0] + " ");
            name.add(sb[1].charAt(0) + ".");
            soname.add(sb[2].charAt(0) + "." + " ");
            age.add(Integer.valueOf(sb[3]));
            gender.add(sb[4] == "M");
            index.add(i);
        }


        for (int i = 0; i < index.size(); i++) {
            System.out.printf(family.get(i));
            System.out.printf(name.get(i));
            System.out.printf(soname.get(i));
            System.out.printf(age.get(i).toString());
            System.out.printf((gender.get(i) ? "M" : "Ж"));
            System.out.println();
        }

        System.out.println(family);

    }

