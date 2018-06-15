package exercises.java;

public class DataObject {
    public static void main(String[] args) {
        DataObject[] dataObjectsArray = new DataObject[3];

        DataObject dataObj1 = new DataObject();
        DataObject dataObj2 = new DataObject();
        DataObject dataObj3 = new DataObject();

        dataObjectsArray[0] = dataObj1;
        dataObjectsArray[1] = dataObj2;
        dataObjectsArray[2] = dataObj3;

        int sum = 0;

        int count = 0;
        for (int i = 0; i < dataObjectsArray.length; i++) {
            count++;
            sum += count;
        }

        System.out.println(sum);
    }
}