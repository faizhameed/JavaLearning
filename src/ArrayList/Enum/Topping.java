package ArrayList.Enum;

public enum Topping {
    MUSTARD,
    PICKLES,
    BEEF,
    CHEDDAR,
    TOMATO,
    SPICE;
    public double getPrice(){
        return switch (this){
            case BEEF -> 1.5;
            case SPICE -> 0.12;
            case TOMATO -> 0.25;
            case CHEDDAR -> 1.0;
            default -> 0.1;
        };
    }

}
