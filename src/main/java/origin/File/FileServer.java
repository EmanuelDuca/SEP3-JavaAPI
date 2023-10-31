package origin.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import origin.protobufClasses.Announcement;
import origin.protobufClasses.PetOwner;
import origin.shared.AnnouncementEntity;
import origin.shared.PetOwnerEntity;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class FileServer {
    private ObjectMapper json;
    private final String filepath = "DatabaseList.txt";

    private static FileServer obj;

    private FileServer() {
        json = new ObjectMapper();
    }

    public static FileServer getInstance() {
        if (obj == null) {
            obj = new FileServer();
        }
        return obj;
    }

    public void AppendToFile(PetOwnerEntity petOwner) {

        try {
            MyFileHandler.appendToTextFile(filepath, convertToString(petOwner));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO Error writing to file");
        }
    }

    public void AppendToFile(AnnouncementEntity announcement) {
        try {
            MyFileHandler.appendToTextFile(filepath, convertToString(announcement));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO Error writing to file");
        }
    }

    private String convertToString(Object obj){
        try{
            return json.writeValueAsString(obj);
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
        return null;
    }




}
