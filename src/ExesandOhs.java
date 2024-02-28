//https://www.codewars.com/kata/55908aad6620c066bc00002a/train/java
public class ExesandOhs {
        public static void main(String[] args) {
        System.out.println(XO.getXO("XXoo"));
    }
    class XO {
        public static boolean getXO(String str) {

            int x = 0, o = 0;

            for(int i = 0; i < str.length(); i++){

                if(str.toUpperCase().charAt(i) == 'O')
                    o++;
                if(str.toUpperCase().charAt(i) == 'X')
                    x++;
            }
            return x == o;
        }
    }
}
