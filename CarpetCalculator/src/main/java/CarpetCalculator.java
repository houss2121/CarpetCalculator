import java.text.NumberFormat;
import java.util.ArrayList;
public class CarpetCalculator implements Calculatable {
    //
    //Data Member
    //
    private float total;
    private final Float priceSQ;
    private float price = 0f;
    private Float installation;
    private final ArrayList<Room> list;
    private float percentDiscount;
    private final NumberFormat numFormat = NumberFormat.getCurrencyInstance();
    //
    //Constructors
    //
    public CarpetCalculator(float priceSQ) {
        this.priceSQ = priceSQ;
        this.list = new ArrayList<>();
    }
    public CarpetCalculator(float priceSQ, float installation){
        this.priceSQ = priceSQ;
        this.installation = installation;
        this.list = new ArrayList<>();
    }
    //
    // Overrides
    //
    @Override
    public void addRoom(Room room) {
        this.list.add(room);
    }
    @Override
    public String getTotalCost() {
        for(Room room : list) {
            total = (total + priceSQ * room.getWidth() * room.getLength());
        }
        if(installation != null){
            total = total + installation;
        }
        var discount = total * percentDiscount;
        total += price - discount;
        return String.valueOf(numFormat.format(total));
    }
    @Override
    public void addPercentDiscount(float percentDiscount) {
        this.percentDiscount = percentDiscount/100;
    }
}
