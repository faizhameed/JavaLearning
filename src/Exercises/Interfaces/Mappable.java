package Exercises.Interfaces;

enum Geometry {
    LINE,
    POINT,
    POLYGON
}

enum PointMarker {CIRCLE, PUSH_PIN, STAR, SQUARE, TRIANGLE}

enum Color {BLACK, BLUE, GREEN, ORANGE, RED}

enum LineMarker {DASHED, DOTTED, SOLID}

public interface Mappable {
    String label = null;
    String geometryType = null;
    String icon = null;
    String JSON_PROPERTY = "\"properties\":{%s}";

    static void mapIt(Mappable mappable) {
        System.out.println(JSON_PROPERTY.formatted(mappable.toJSON()));
    }

    public String getLabel();

    public String getMarker();

    public Geometry getShape();

    default String toJSON() {
        return """
                "type":"%s","label":"%s","marker":"%s"
                """.formatted(getShape(), getLabel(), getMarker());
    }
}