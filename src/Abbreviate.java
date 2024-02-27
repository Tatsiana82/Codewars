//https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3/train/java
public class Abbreviate {
    public static void main(String[] args) {
        System.out.println(AbbreviateTwoWords.abbrevName("John Doe"));
    }
    class AbbreviateTwoWords {

        public static String abbrevName(String name) {
            return (name.charAt(0) + "." + name.charAt(name.indexOf(" ") + 1)).toUpperCase();


        }
    }
}