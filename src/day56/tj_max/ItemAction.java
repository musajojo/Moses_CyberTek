package day56.tj_max;
// day 56 : TJMax Task : Item and OnSaleItem
public class ItemAction {

    public static void main(String[] args) {

        Item i1 = new OnSaleItem("Cake", 111, 2, 20.0, 50);
        System.out.println("Cake  Price = " + i1.getPrice());
        System.out.println(i1);


    }


}