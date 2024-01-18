public class PrintDayInMonth {
    public static int printDayInMonth(Month month) {
        return switch (month) {
            case JANUARY -> Month.JANUARY.getDayInMonth();
            case FEBRUARY -> Month.FEBRUARY.getDayInMonth();
            case MARCH -> Month.MARCH.getDayInMonth();
            case APRIL -> Month.APRIL.getDayInMonth();
            case MAY -> Month.MAY.getDayInMonth();
            case JUNE -> Month.JUNE.getDayInMonth();
            case JULY -> Month.JULY.getDayInMonth();
            case AUGUST -> Month.AUGUST.getDayInMonth();
            case SEPTEMBER -> Month.SEPTEMBER.getDayInMonth();
            case OCTOBER -> Month.OCTOBER.getDayInMonth();
            case NOVEMBER -> Month.NOVEMBER.getDayInMonth();
            case DECEMBER -> Month.DECEMBER.getDayInMonth();
            default -> throw new IllegalArgumentException("Unsupported month: " + month);
        };
    }
    public static void main(String[] args) {
        System.out.println(printDayInMonth(Month.JANUARY));
        System.out.println(printDayInMonth(Month.FEBRUARY));
        System.out.println(printDayInMonth(Month.MARCH));
        System.out.println(printDayInMonth(Month.APRIL));
        System.out.println(printDayInMonth(Month.MAY));
        System.out.println(printDayInMonth(Month.JUNE));
        System.out.println(printDayInMonth(Month.JULY));
        System.out.println(printDayInMonth(Month.AUGUST));
        System.out.println(printDayInMonth(Month.SEPTEMBER));
        System.out.println(printDayInMonth(Month.OCTOBER));
        System.out.println(printDayInMonth(Month.NOVEMBER));
        System.out.println(printDayInMonth(Month.DECEMBER));
    }
}
