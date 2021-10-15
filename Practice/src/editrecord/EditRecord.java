package editrecord;

import java.io.*;
import java.util.Scanner;

public class EditRecord {

    private static Scanner x;
    public static void main(String[] args) throws IOException {
        String filepath = "/Users/carringtonjones/IdeaProjects/javaPractice/Practice/records.txt"; // Have to paste absolute path
        String editTerm = "4444";
        String newID = "2222";
        String newName = "Donald";
        String newAge = "65";

        editRecord(filepath, editTerm, newID, newName, newAge);
    }

    public static void editRecord(String filepath, String editTerm, String newID, String newName, String newAge) throws IOException {

        String tempFile = "temp.txt";
        File oldFile =  new File(filepath);
        File newFile = new File(tempFile);
        String Id = "";
        String name = "";
        String age = "";

            FileWriter fw = new FileWriter(tempFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            x = new Scanner(new File(filepath));
            x.useDelimiter("[,\n]");

            while(x.hasNext()) {
                Id = x.next();
                name = x.next();
                age = x.next();

                if(Id.equals(editTerm)){
                    pw.println(newID + "," + newName + "," + newAge);
                }
                else {
                    pw.println(Id + "," + name + "," + age);
                }
            }
            x.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File dump = new File(filepath);
            newFile.renameTo(dump);
    }

}
