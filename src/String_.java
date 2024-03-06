public class String_ {
    public static void main(String[] args) {
        System.out.println(Kata.filterString("a1b2c3"));
    }
    class Kata {

        public static long filterString(final String value) {


            String str = "";

            String newStr = "";

            for(int i = 0; i < value.length(); i++){
                if(Character.isDigit(value.charAt(i)))
                    newStr += value.charAt(i);
            }

            return Long.parseLong(newStr);
        }
    }
}
