public class Rollercoaster extends Attraction {

    private String rollercoasterName;

    public Rollercoaster(String name, int positionNumber){
        super(name, positionNumber);
        this.rollercoasterName = rollercoasterName;
    }

    public String getRollercoasterName() {
        return rollercoasterName;
    }
}
