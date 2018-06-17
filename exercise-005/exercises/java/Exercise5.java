package exercises.java;

import java.util.Arrays;

public class Exercise5 {
    public static void main(String[] args) {
        DataObject5[] dataObjectsArray = new DataObject5[5];

        DataObject5 dataObj1 = new DataObject5();
        DataObject5 dataObj2 = new DataObject5();
        DataObject5 dataObj3 = new DataObject5();
        DataObject5 dataObj4 = new DataObject5();
        DataObject5 dataObj5 = new DataObject5();

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

        int sum = 0;

        for (DataObject5 dataObject : dataObjectsArray) {
            if (dataObject.code.equals("friday")) {
                sum += dataObject.count;
            }
        }

        System.out.println(sum);
        System.out.println(Arrays.toString(dataObjectsArray));;
    }
}