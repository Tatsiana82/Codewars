//https://github.com/Tatsiana82/Codewars/blob/main/src/Abbreviate.java
public class Beginner {
    public static void main(String[] args) {
        System.out.println(Paper.paperWork(5, 7));
    }
    class Paper
    {
        public static int paperWork(int n, int m)
        {
            if (m < 0 || n < 0) {
                return 0;
            }
            return m * n;
        }

    }
}
