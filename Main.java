public class Main {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>(10);
        integerBox.printItem();
        Box<String> stringBox = new Box<>("Hello");
        stringBox.printItem();
        Integer[] intArray =  {1,2,3,4};
        String[] strArray = {"A", "B", "C"};
        GenericMethodDemo demo = new GenericMethodDemo();
        demo.printArray(intArray);
        demo.printArray(strArray);


    }
}
