public class ActionCard implements Card {
    private String action;
    private String color;

    public ActionCard(String type, String color) {
        this.action = action;
        this.color = color;
    }

    @Override
    public String getType() {
        return "accion";
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void play() {
        System.out.println("Playing an action card of type: " + action+ " and color: " + color);
    }
    @Override
    public String toString() {
        return "ActionCard{" +
                "action='" + action + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
