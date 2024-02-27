//https://www.codewars.com/kata/563b74ddd19a3ad462000054/train/java
public class Stringy {
    public static void main(String[] args) {
        System.out.println(Kata.stringy(5));
    }
   class Kata {
        public static String stringy(int size) {
            String str = "";
            for(int i = 0; i < size / 2; i++){
                str += "10";
            }
            if (size % 2 == 1){
                str += "1";
            }
            return str;
        }
    }
}
