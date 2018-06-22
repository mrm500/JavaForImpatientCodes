package JavaForImpatientCodes.chapter04;

public class exercise06 {
    public static void main(String[] args){
        DiscountedItem candle  = new DiscountedItem("candle",20, 10);
        Item normalCandle = new Item("candle", 20);
        DiscountedItem newCandle = new DiscountedItem("candle", 20, 12);
        System.out.println("candle.equals(normalCandle) : " + candle.equals(normalCandle));
        System.out.println("normalCandle.equals(newCandle) : " + normalCandle.equals(newCandle));
        System.out.println("candle.equals(newCandle) : " + candle.equals(newCandle));
    }
}

class Item{
    private String description;
    private double price;

    public String getDescription() {
        return description;
    }
    public double getPrice() {
        return price;
    }
    public Item(String description, double price){
        this.description = description;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        //if (obj == null || getClass() != obj.getClass())
        if (!(obj instanceof Item))
            return false;
        Item temp = (Item) obj;
        return this.description.compareTo(temp.description) == 0 && Double.compare(this.price,temp.price) == 0;
    }
    public void test(){
        System.out.println(getClass());
    }
}

class DiscountedItem extends Item{
    private double discount;

    public double getDiscount() {
        return discount;
    }
    public DiscountedItem(String description, double price, double discount){
        super(description,price);
        this.discount = discount;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj))
            return false;
        if (obj.getClass() == (new Item("",0)).getClass())
            return true;
        DiscountedItem temp = (DiscountedItem) obj;
        return this.discount == temp.getDiscount();
    }

    @Override
    public void test() {
        super.test();
        System.out.println(getClass());
    }
}
