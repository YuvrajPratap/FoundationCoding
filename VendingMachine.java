//public enum VendingCapacity {
//    private int capacity;
//    private VendingCapacity(int capacity) {
//        this.capacity = capacity;
//    }
//    public int getCapacity(){
//        return capacity;
//    }
// }
//
//public enum Product {
//    private String name;
//    private int price;
//    private Product(String name, int price){
//        this.name = name;
//        this.price = price;
//    }
//    public String getName(){
//        return name;
//    }
//    public long getPrice(){
//        return price;
//    }
//}
//
//
//
//public class VendingMachineImpl {
//    public long selectItemAndGetPrice(Item item) {
//        if(itemInventory.hasItem(item)) {
//            currentItem = item;
//            return currentItem.getPrice();
//        }
//        return 0;
//    }
//
//    public int loadingCapacity(int capacity) {
//
//    }
//    static float paymentMethod(String paymentType, float amount) {
//        float totalAmount;
//        switch (paymentType) {
//            case CASH:
//                totalAmount = amount;
//                return totalAmount;
//            case CARD:
//                totalAmount = amount * 2;
//                return totalAmount;
//        }
//    }
//
//}
