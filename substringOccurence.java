public class substringOccurence {
    public static String countOccurrences() {
       String str = "I love coding, I love coding in Java";
       String substr = str.substring(0);
        return substr;
    }

    public static void counter(){
        int counter = 0;
        if (countOccurrences().contains("coding")){
            counter++;
            System.out.println("counter is:" + counter);
        }
    }

    public static void main(String[] args) {
        System.out.println(countOccurrences());
        counter();

    }
}



