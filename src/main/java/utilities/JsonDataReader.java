package utilities;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JsonDataReader {

    public String JsonReader(String value) throws IOException, ParseException {

        String filePath = System.getProperty("user.dir","UTF-8") + "/src/main/java/utilities/ArabicData.json";

        //System.setProperty("file.encoding", "UTF-8");
        File srcFile = new File(filePath);
        String data = "قيمه مبدأيه";
        JSONParser parser = new JSONParser();
        JSONArray jarray = (JSONArray) parser.parse(new FileReader(srcFile));

        for (Object jsonObj : jarray) {
            JSONObject person = (JSONObject) jsonObj;

            if (value == "ArabicLanguage")
            {
                data = (String) person.get("ArabicLanguage");

            }
            else if (value == "Arabic_SA_Currency")
            {
                data = (String) person.get("Arabic_SA_Currency");

            }
            else if (value == "Arabic_KU_Currency")
            {
                data = (String) person.get("Arabic_KU_Currency");
            }
            else if (value == "Arabic_BA_Currency")
            {
                data = (String) person.get("Arabic_BA_Currency");
            }
        }
        return data;
    }

}
