public class ArrayIndexStorage extends IndexStorage {
    private int[] arr;

    public ArrayIndexStorage(int[] arr) {
        super(arr.length);
        this.arr = new int[size()];
        for (int i = 0; i < size(); i++) {
            this.arr[i] = arr[i];
        }
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    @Override
    public int get(int index) {
        return arr[index];
    }
}
