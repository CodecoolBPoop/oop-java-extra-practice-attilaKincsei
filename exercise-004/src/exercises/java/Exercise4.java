package exercises.java;

import java.util.Arrays;

public class Exercise4 {
    public static void main(String[] args) {
        DataObject[] dataObjectsArray = new DataObject[3];

        DataObject dataObj1 = new DataObject();
        DataObject dataObj2 = new DataObject();
        DataObject dataObj3 = new DataObject();

        dataObjectsArray[0] = dataObj1;
        dataObjectsArray[1] = dataObj2;
        dataObjectsArray[2] = dataObj3;

        int sum = 0;


        for (int i = 0; i < dataObjectsArray.length; i++) {
            sum += dataObjectsArray[i].count;
        }

        System.out.println(sum);
        Arrays.toString(dataObjectsArray);
    }
}