package Exercises.Interfaces;

enum TYPE {
    ELECTRICAL, WATER, GAS, FIBER_OPTICS
}

public class UtilityLine implements Mappable {
    private String name;

    private TYPE type;

    public UtilityLine(String name, TYPE type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getLabel() {
        return name + " (" + type + ") ";
    }

    @Override
    public Geometry getShape() {
        return Geometry.LINE;
    }

    @Override
    public String getMarker() {
        return switch (type) {
            case ELECTRICAL -> Color.RED + " " + LineMarker.DASHED;
            case FIBER_OPTICS -> Color.GREEN + " " + LineMarker.DOTTED;
            case GAS -> Color.ORANGE + " " + LineMarker.SOLID;
            case WATER -> Color.BLUE + " " + LineMarker.SOLID;
            default -> Color.BLACK + " " + LineMarker.SOLID;
        };
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                , "name":"%s", "utility:"%s" """.formatted(name, type);
    }
}