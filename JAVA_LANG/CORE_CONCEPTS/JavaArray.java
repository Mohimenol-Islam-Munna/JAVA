public class JavaArray {
    public static void main(String[] args) {
        System.out.println("Java array");

        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println("numbers ::" + numbers);

        // access array item
        System.out.println("numbers[5] :: " + numbers[5]);

        // change array item
        numbers[6] = 600;
        System.out.println("numbers[5] :: " + numbers[6]);

        // array length
        System.out.println("numbers length :: " + numbers.length);

        // loop through an array
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Array item %d = %d \n", i + 1, numbers[i]);
        }

        // loop through an array:: another way
        for (int item : numbers) {
            System.out.printf("Array item :: %d \n", item);
        }

        // multi dimensinal array
        int[][] mNum = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 } };

        // access item of multi dimensional array
        System.out.printf("access item of multi dimensional array :: %d \n", mNum[1][4]);

        // length of multi dimensional array 
        System.out.printf("length of multi dimensional array :: %d \n", mNum.length);

        // loop through an multi dimensional array
        for (int i = 0; i < mNum.length; i++) {
            for (int j = 0; j < mNum[i].length; j++) {
                System.out.printf("Array item %d = %d \n", i + 1, mNum[i][j]);
            }
        }

    }
}