package hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashmapReportPage {
    public static void main(String[] args) {
        HashMap<String, String> subjectInformation = new HashMap<>();
        subjectInformation.put("Case ID", "000001");
        subjectInformation.put("Suspect type", "robbery");
        subjectInformation.put("Last name", "Petrov");
        subjectInformation.put("First name", "Ivan");
        subjectInformation.put("Middle name", "Ivanovich");
        subjectInformation.put("Nickname(AKA)", "robby");
        subjectInformation.put("Date of birth", "12.08.1982");
        subjectInformation.put("Age", "35");
        subjectInformation.put("Sex", "male");
        subjectInformation.put("Race", "white");
        subjectInformation.put("Height", "189");
        subjectInformation.put("Weight", "132");
        subjectInformation.put("Hair color", "grey");
        subjectInformation.put("Hair length", "40");
        subjectInformation.put("Hair Style", "curly hair");
        subjectInformation.put("Eye color", "grey");
        subjectInformation.put("Complexion", "pale");
        subjectInformation.put("Teeth", "white");
        subjectInformation.put("Primary language", "English");
        subjectInformation.put("Street address", "309 Easy st.");
        subjectInformation.put("Country", "USA");
        subjectInformation.put("City", "Sunnyvale");
        subjectInformation.put("State", "CA");
        subjectInformation.put("Zip", "94084");
        subjectInformation.put("Telephone", "6695646573");
        subjectInformation.put("Email", "petrov@gmail.com");
        subjectInformation.put("Driver", "yes");
        subjectInformation.put("Passenger", "yes");
        subjectInformation.put("Pedestrian", "yes");

        for(Map.Entry subInfo: subjectInformation.entrySet()){
            System.out.println("Key: " + subInfo.getKey() + " Value: " + subInfo.getValue());
        }

    }
}
