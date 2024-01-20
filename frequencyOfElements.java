package frequency;
public class frequencyOfElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 3, 1, 1, 2, 2};
        int[] freq = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = -1;
                }
            }
            if (freq[i] != -1) {
                freq[i] = count;
            }
        }

        System.out.println("Element : Frequency");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != -1) {
                System.out.println(arr[i] + " : " + freq[i]);
            }
        }
    }
}
