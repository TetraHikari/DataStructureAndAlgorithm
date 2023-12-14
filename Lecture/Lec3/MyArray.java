package Lecture.Lec3;

public class MyArray {
    int MAX_SIZE = 5;
    int data[] = new int[MAX_SIZE];
    int size = 0;

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int i = 0; i<size-1; i++){
            sb.append(data[i]);
            sb.append(",");
        }
        if(size>0) sb.append(data[size-1]);
        sb.append("]");
        return sb.toString();
    }
}
