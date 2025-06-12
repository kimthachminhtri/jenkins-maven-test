/**
 * Converts numeric scores into letter grades.
 */
public final class GradeConverter {

    private static final int GRADE_A_MIN = 90;
    private static final int GRADE_B_MIN = 80;
    private static final int GRADE_C_MIN = 70;
    private static final int GRADE_D_MIN = 60;

    /**
     * Converts a numeric score to a letter grade.
     *
     * @param score the score to convert
     * @return the corresponding letter grade
     */
    public static String convert(final int score) {
        if (score >= GRADE_A_MIN) {
            return "A";
        } else if (score >= GRADE_B_MIN) {
            return "B";
        } else if (score >= GRADE_C_MIN) {
            return "C";
        } else if (score >= GRADE_D_MIN) {
            return "D";
        } else {
            return "E";
        }
    }
}
