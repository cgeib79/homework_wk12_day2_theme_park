public abstract class Attraction {
    String name;
    int positionNumber;

    public Attraction(String name, int positionNumber){
        this.name = name;
        this.positionNumber = positionNumber;
    }

    public String getName(){
        return name;
    }

    public int getPositionNumber(){
        return positionNumber;
    }
}
