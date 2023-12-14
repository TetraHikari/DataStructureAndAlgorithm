package code;

public class MyArrayBasic_65011446 {
    protected int MAX_SIZE = 5;
    protected int data[] = new int[MAX_SIZE];
    protected int size = 0;

    public MyArrayBasic_65011446(int ... d){
        if (d == null){
            return;
        }
        for (int i = 0; i < d.length; i++)
            add(d[i]);
    }

    public void add(int d){
        if (size < MAX_SIZE) {
            data[size] = d;
            size++;
        }
    }

    public void insert(int d, int index){
        if (size < MAX_SIZE) {
            for (int i = size; i > index; i--)
                data[i] = data[i-1];
            data[index] = d;
            size++;
        }
    }

    public int find(int d){
        for (int i = 0; i < size; i++)
            if (data[i] == d)
                return i;
        return -1;
    }

    public int binarySearch(int d){
        int left = 0, right = size-1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (data[mid] == d)
                return mid;
            else if (data[mid] < d)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public void delete(int index){
        if (index < size) {
            for (int i = index; i < size-1; i++)
                data[i] = data[i+1];
            size--;
        }
    }




}
