public enum Color {
    RED("255, 0, 0"),
    BLUE("0, 0, 255"),
    GREEN("0, 128, 0");

    private final String rgbColor;

    Color(String rgbColor) {
        this.rgbColor = rgbColor;
    }
    public String getRGBColor() {
        return rgbColor;
    }
}
