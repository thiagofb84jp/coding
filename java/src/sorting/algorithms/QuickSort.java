package sorting.algorithms;

public class QuickSort {
    private int tempArray[];
    private int len;

    public void sort(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        this.tempArray = nums;
        len = nums.length;
        quickSort(0, len - 1);
    }

    public void quickSort(int lowIndex, int highIndex) {
        int i = lowIndex;
        int j = highIndex;

        int pivot = tempArray[lowIndex + (highIndex - lowIndex) / 2];

        while (i <= j) {
            while (tempArray[i] < pivot) {
                i++;
            }
            while (tempArray[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                i++;
                j--;
            }
        }
        if (lowIndex < j) {
            quickSort(lowIndex, j);
        }
        if (i < highIndex) {
            quickSort(i, highIndex);
        }
    }

    public void exchangeNumbers(int i, int j) {
        int temp = tempArray[i];
        tempArray[i] = tempArray[j];
        tempArray[j] = temp;
    }
}
