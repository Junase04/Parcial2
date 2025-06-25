public class WildCard implements Card {
    private String effect;
    
    

    public WildCard(String type, String color) {
        this.effect = effect;
        
    }

    public WildCard(String especial) {
        
    }

    @Override
    public String getType() {
        return "especial";
    }

    @Override
    public String getColor() {
        return null; 
    }

    @Override
    public void play() {
        System.out.println("Playing a wild card of type: " + effect );
    }
    @Override
    public String toString() {
        return "WildCard{" +
                "effect='" + effect + '\'' +
                '}';
    }
}
