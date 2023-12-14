
public class Dog {
    private String breed;
    private int magicValue;

    public Dog(String n) {
        breed = n;
        int v = 0;
        for (int i = 0; i < breed.length(); i++) {
            v += breed.charAt(i);
        magicValue = v;
        }
    }

    @Override
    public String toString() {
        return breed + "(" + magicValue + ")";
    }

    public String getBreed() {
        return breed;
    }

    public int getMagicValue() {
        return magicValue;
    }

}
