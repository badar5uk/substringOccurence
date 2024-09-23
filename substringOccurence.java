public class substringOccurence {

    public static void main(String[] args) {
        String str = "I love coding, I love coding in Java";
        String substr = str.substring(0);
        int counter = 0;
        if (substr.contains("coding")) {
            counter++;
            System.out.println("counter is:" + counter);
        }
    }
}



