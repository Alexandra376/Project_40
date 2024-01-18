public class DayInMonth {
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
        System.out.println("JANUARY: " + printDayInMonth(Month.JANUARY));
        System.out.println("FEBRUARY: " + printDayInMonth(Month.FEBRUARY));
        System.out.println("MARCH: " + printDayInMonth(Month.MARCH));
        System.out.println("APRIL: " + printDayInMonth(Month.APRIL));
        System.out.println("MAY: " + printDayInMonth(Month.MAY));
        System.out.println("JUNE: " + printDayInMonth(Month.JUNE));
        System.out.println("JULY: " + printDayInMonth(Month.JULY));
        System.out.println("AUGUST: " + printDayInMonth(Month.AUGUST));
        System.out.println("SEPTEMBER: " + printDayInMonth(Month.SEPTEMBER));
        System.out.println("OCTOBER: " + printDayInMonth(Month.OCTOBER));
        System.out.println("NOVEMBER: " + printDayInMonth(Month.NOVEMBER));
        System.out.println("DECEMBER: " + printDayInMonth(Month.DECEMBER));
    }
}
