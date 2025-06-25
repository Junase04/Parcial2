public class NumberCard implements Card {
    private String type ;
    private String color; 
    
   public NumberCard(String colorNum, String numero) {
        //TODO Auto-generated constructor stub
    }
   @Override
    public String getType() {
        return "numero";
    }
    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void play() {
        System.out.println("Playing a number card of type: " + type + " and color: " + color);
    }
    @Override
    public String toString() {
        return "NumberCard{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
