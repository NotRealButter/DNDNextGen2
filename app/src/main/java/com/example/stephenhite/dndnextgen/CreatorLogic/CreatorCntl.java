package com.example.stephenhite.dndnextgen.CreatorLogic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by Stephen Hite on 4/14/2015.
 */
public class CreatorCntl {
    UserCharacter userCharacter;

    private final String charFilePath = "character_saves";
    private String charID = "char" + userCharacter.getName();
    private String fileExt = ".dndng";

    public void loadCharacter() {
        FileInputStream saveInput = null;
        ObjectInputStream charInput = null;
        String filePath = charFilePath + charID + fileExt;
        try {
            File f = new File(filePath);
            if (f.exists()) {
                saveInput = new FileInputStream(filePath);
                charInput = new ObjectInputStream(saveInput);
                userCharacter = (UserCharacter) charInput.readObject();
                charInput.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }


    public void saveCharacter() {
        FileOutputStream saveOutput = null;
        ObjectOutputStream charOutput = null;
        String filePath = charFilePath + charID + fileExt;
        try {
            saveOutput = new FileOutputStream(filePath);
            charOutput = new ObjectOutputStream(saveOutput);
            charOutput.writeObject(userCharacter);
            charOutput.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
