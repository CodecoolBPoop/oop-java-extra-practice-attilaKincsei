package exercises.java;

import java.util.HashMap;

public class Exercise6 {
    public static void main(String[] args) {
        HashMap<String, Integer> sumsForCodes = new HashMap<>();

        DataObject6[] dataObjectsArray = new DataObject6[5];

        DataObject6 dataObj1 = new DataObject6();
        DataObject6 dataObj2 = new DataObject6();
        DataObject6 dataObj3 = new DataObject6();
        DataObject6 dataObj4 = new DataObject6();
        DataObject6 dataObj5 = new DataObject6();

        dataObj1.code = "friday";
        dataObj2.code = "saturday";
        dataObj3.code = "friday";
        dataObj4.code = "saturday";
        dataObj5.code = "saturday";

        dataObjectsArray[0] = dataObj1;
        dataObjectsArray[1] = dataObj2;
        dataObjectsArray[2] = dataObj3;
        dataObjectsArray[3] = dataObj4;
        dataObjectsArray[4] = dataObj5;

        for (int i = 0; i < dataObjectsArray.length; i++) {
            if (!sumsForCodes.containsKey(dataObjectsArray[i].code)) {
                sumsForCodes.put(dataObjectsArray[i].code, 0);
            }
            sumsForCodes.put(dataObjectsArray[i].code, sumsForCodes.get(dataObjectsArray[i].code) + 1);
        }

        for (String key : sumsForCodes.keySet()) {
            System.out.printf("%s: ", key);
            System.out.println(sumsForCodes.get(key));
        }
    }
}