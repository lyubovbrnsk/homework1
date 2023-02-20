public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new int[] {1, 8, 20, 58});
        System.out.println(salesManager.max());
        System.out.println(salesManager.min());
        System.out.println(salesManager.average());
    }
}
