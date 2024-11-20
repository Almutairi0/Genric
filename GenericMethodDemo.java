public class GenericMethodDemo {
    public  <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
        System.out.println();
    }

}
