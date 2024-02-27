//https://www.codewars.com/kata/582cb0224e56e068d800003c/train/java
public class Keep {
    public static void main(String[] args) {
        System.out.println(KeepHydrated.Liters(3.0));
    }
    class KeepHydrated  {

        public static int Liters(double time)  {

            return (int)time / 2;

        }

    }
}
