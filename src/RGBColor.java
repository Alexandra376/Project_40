public class RGBColor {
    public static String convertToRGBColor(Color color) {
        return switch (color) {
            case RED -> Color.RED.getRGBColor();
            case BLUE -> Color.BLUE.getRGBColor();
            case GREEN -> Color.GREEN.getRGBColor();
            default -> throw new IllegalArgumentException("Unsupported color: " + color);
        };
    }
    public static void main(String[] args) {
        System.out.println(convertToRGBColor(Color.RED));
        System.out.println(convertToRGBColor(Color.BLUE));
        System.out.println(convertToRGBColor(Color.GREEN));
    }
}
