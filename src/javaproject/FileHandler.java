package javaproject;

import java.util.ArrayList;
import java.util.LinkedList;
import java.io.*;


public class FileHandler {
    public LinkedList<Member> readFile() {
        LinkedList<Member> M = new LinkedList();
        String lineRead;
        String[] splitLine;
        Member mem;

        try (BufferedReader reader = new BufferedReader(new FileReader("members.csv"))) {
            lineRead = reader.readLine();
            while (lineRead != null) {
                splitLine = lineRead.split(", ");
                if (splitLine[0].equals("S")){
                    mem = new SingleClubMember('S', Integer.parseInt(splitLine[1]), splitLine[2], Double.parseDouble(splitLine[3]), Integer.parseInt(splitLine[4]));


                }
            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return M;
    }

//    public void appendFile() {
//    }
//
//    public void overWriteFile() {
//    }

}
