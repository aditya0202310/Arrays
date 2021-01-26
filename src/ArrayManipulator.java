public class ArrayManipulator {
    private static int[] list;

    public ArrayManipulator(int numElements) {
        list = new int[numElements];

    }

    public static int getMiddleIndex() {
        if (list.length % 2 == 0)
            return list[list.length / 2 - 1];
        return list[list.length / 2];
    }

    public static double getAvg() {
        int sum = list[0];
        sum += list[getMiddleIndex()];
        sum += list[list.length - 1];
        sum -= 9;
        return sum / 3.0;
    }

    public static void mystery3(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                nums[i + 1]++;
            }
        }
        for (int currentNumbers : nums) {
            System.out.println(currentNumbers);
        }
    }
    public static void mystery2(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (i % 2 == 0) {
                list[i]++;
            } else {
                list[i]--;
            }
        }
        for(int currentNumbers : list){
            System.out.println(currentNumbers);
        }
    }
    public static void computeAverage(double[] arr) {
        double sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            sum += arr[i];
        }
        System.out.println(sum/ arr.length);
    }
    public static void switchPairs(String [] str){
           if(str.length % 3 == 0){
               for(int i = 0; i < str.length - 2; i++){

               }
           }
        for(String test : str){
            System.out.println(test);
        }
        System.out.println("Finished!");
    }
//
//    public static int maxValue(int [] arr) {
//        int largestNum = 0;
//        largestNum += 1;
//        return largestNum % 2;
//
//    }
//        for (int i = 0; i < arr.length - 1 || i == 0; i++) {
//            if (arr[i] == arr[arr.length - 1]) {
//                largestNum = arr[i];
//            } else if (arr[i] >= arr[arr.length - 1]) {
//                largestNum = arr[i];
//            } else if (largestNum >= arr[arr.length - 1]) {
//                largestNum += 0;
//            } else
//                largestNum = arr[arr.length - 1];
//        }
//        return largestNum;
//    }

        public static void main (String[]args){
        String [] switchPairs;
        switchPairs = new String[]{"a", "bb", "c", "ddd", "ee", "f", "g"};
//            double[] ListOne;
//            ListOne = new double []{12, 7, -1, 25, 2, 39};
//            computeAverage(ListOne);
            switchPairs(switchPairs);
        }
    }