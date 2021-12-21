public class Main {

    public static void main(String[] args) {
        findingNumber();
        findingNumber();
        findingNumber();
    }

    public static void findingNumber(){
        int[] numbers = new int[]{1, 3, 5, 7, 9};
        int findingNumber = 7;
        boolean isThere = false;

        for (int number : numbers) {
            if (number == findingNumber) {
                isThere = true;
                break;
            }
        }

        if (isThere) {
            message("This number is available: " + findingNumber);
        } else {
            message("This number is not available: " + findingNumber);
        }
    }

    public static void message(String message){
        System.out.println(message);
    }

}
