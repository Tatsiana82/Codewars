//https://www.codewars.com/kata/58261acb22be6e2ed800003a/train/java
public class Volume {
    public static void main(String[] args) {
        System.out.println(Kata.getVolumeOfCuboid(6.0, 2.5, 5.3));
    }
    public class Kata {

        public static double getVolumeOfCuboid(final double length, final double width, final double height) {

            return length * width * height;
        }

    }
}
