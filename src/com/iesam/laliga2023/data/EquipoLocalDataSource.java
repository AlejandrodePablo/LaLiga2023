package src.com.iesam.laliga2023.data;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import src.com.iesam.laliga2023.domain.Equipo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Scanner;

public class EquipoLocalDataSource {
    private String nameFile = "equipo.txt";
    private Gson gson = new Gson();
    private final Type type = new TypeToken<Equipo>() {  }.getType();

    public void save(Equipo model) {
        try {
            FileWriter myWriter = new FileWriter(nameFile);
            myWriter.write(gson.toJson(model));
            myWriter.close();
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la información.");
            e.printStackTrace();
        }
    }

    public Equipo findById(Integer id) {
        try {
            File myObj = new File(nameFile);
            if (!myObj.exists()) {
                myObj.createNewFile();
            }
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                myReader.close();
                return gson.fromJson(data, type);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ha ocurrido un error al obtener el listado.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al crear el fichero.");
            throw new RuntimeException(e);
        }
        return null;
    }
}
