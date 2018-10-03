public abstract class Stall {
    String name;
    int positionNumber;
    double unitPrice;

    public Stall(String name, int positionNumber, double unitPrice){
        this.name = name;
        this.positionNumber = positionNumber;
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return name;
    }

    public int getPositionNumber(){
        return positionNumber;
    }

    public double getUnitPrice(){
        return unitPrice;
    }
}
