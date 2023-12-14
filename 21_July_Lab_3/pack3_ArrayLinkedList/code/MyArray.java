package code;

public class MyArray extends MyArrayBasic_65011446{
    protected int MAX_SIZE; //5
    protected int data[]; //size = 5
    protected int size = 0;

    public MyArray(){
        MAX_SIZE = 100000;
        this.data = new int [MAX_SIZE];
    }
  
    public MyArray(int max){
        MAX_SIZE = max;
        this.data = new int [MAX_SIZE];
    }

    public boolean isFull(){
        return size == MAX_SIZE;
    }

    public boolean isEmpty(){
        if (size == 0){
            return true;
        }
        return false;
    }

    public int [] expandByK(int k){
        int [] temp = new int [MAX_SIZE + k];
        for (int i = 0; i < size; i++){
            temp[i] = data[i];
        }
        MAX_SIZE += k;
        return temp;
    }

    public int [] expand(){
        int [] temp = new int [MAX_SIZE * 2];
        for (int i = 0; i < size; i++){
            temp[i] = data[i];
        }
        MAX_SIZE *= 2;
        return temp;
    }

    @Override
    public void add(int d){
        if (isFull()){
            data = expand();
        }
        data[size] = d;
        size++;
    }
}
