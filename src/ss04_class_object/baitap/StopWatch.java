package ss04_class_object.baitap;

public class StopWatch {
    private long startTime;
    private long endTime;


    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

//    public void setStartTime(long startTime) {
//        this.startTime = startTime;
//    }

    public long getEndTime() {
        return endTime;
    }

//    public void setEndTime(long endTime) {
//        this.endTime = endTime;
//    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void end() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }


    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        selectionSort(generateRandomArray());
        stopWatch.end();
        System.out.println("Elapsed Time: " + stopWatch.getElapsedTime() + " milliseconds");
    }

    public static void selectionSort(int[] arr) {
        int indexMin;
        int i;
        int j;
        for (i = 0; i < arr.length - 1; i++) {
            indexMin = i;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indexMin]) {
                    indexMin = j;
                }
            }
            if (indexMin != i) {
                int temp = arr[indexMin];
                arr[indexMin] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println(arr.length);
//        System.out.println(Arrays.toString(arr));
    }

    public static int[] generateRandomArray() {
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }
        return array;
    }

}
