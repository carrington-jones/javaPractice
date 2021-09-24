package InterviewPrep;

public class SquareRootCheck {
    public class Square {
        public static boolean isSquare(int n) {
            double sq = Math.sqrt(n);

            if(((sq - Math.floor(sq)) == 0)){


                return true; // fix me!
            } else {
                return false;
            }
        }
    }
}
