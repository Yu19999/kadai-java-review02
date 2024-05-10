
public class Revie01 {

    public static void main(String[] args) {
        int price = 1500;
        double taxrate = 0.1;
        int result = price + tax(price,taxrate);
        System.out.println(price + "円の商品の税込価格は" + result + "円（消費税は" + tax(price,taxrate) + "円）です。");

    }

    public static int tax(int price, double taxrate) {
        int result = (int) (price * taxrate);
        return result;
    }
}
