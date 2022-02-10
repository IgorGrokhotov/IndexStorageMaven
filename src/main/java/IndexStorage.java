public class IndexStorage {
    private int size = 0;

    public IndexStorage(int size) {
        this.size = size;
    }

    public int size() {
        return size;
    }

    public int get(int index) {
        return 0;
    }

    public int[] reverse() {
        int[] arr = new int[size];
        for (int i = 0; i < size / 2 + 1; i++) {
            int cell = get(size - 1 - i);
            arr[size - 1 - i] = get(i);
            arr[i] = cell;
        }
        return arr;
    }
}
