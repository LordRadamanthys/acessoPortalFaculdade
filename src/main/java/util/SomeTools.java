package util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.FinancasHistoric;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public class SomeTools {
    private static final Calendar date = Calendar.getInstance();

    public static void gerarJson(List<FinancasHistoric> list) {
        buildDirectory();
        String dateToDayJson = getDateNow();


        try (Writer file2 = new FileWriter(
                System.getenv("JsonPath") + "\\" + dateToDayJson.replace("/", "-") + ".json")) {
            Gson gson2 = new GsonBuilder().setPrettyPrinting().create();
            gson2.toJson(list, file2);
            System.out.println(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getDateNow() {
        Calendar calendar = (Calendar) date.clone();
        return formatDate(calendar);
    }

    public static String formatDate(Calendar calendar) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(calendar.getTime());
    }

    public static void buildDirectory() {
        try {
            if (!new File(System.getenv("JsonPath")).exists()) {
                new File(System.getenv("JsonPath")).mkdir();
                System.out.println("pasta criado");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
