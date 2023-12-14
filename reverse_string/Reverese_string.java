
public class Reverese_string {
    public static void main(String[] arg){
        StringBuilder str = new StringBuilder("Hello World");
        char index = 0;

        for (int i = str.length() - 1; i >= 0 ; --i){
            index = str.charAt(i);
            str.append(index);
            str.deleteCharAt(i);
        }

        System.out.println(str);
    }
    
}
