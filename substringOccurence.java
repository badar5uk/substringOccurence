public class substringOccurence {

    public static void main(String[] args) {
        int counter = 0;
        String str = "banana";
        String substr = "ana";
        int endingIndex = substr.length();
        for (int i = 0; i <= str.length() - substr.length(); i++){
            String matchingCharacters = str.substring(i, endingIndex++);
            if (substr.equals(matchingCharacters)) {
                counter++;
            }
        }
        System.out.println("The Substring " + substr +" occurs "+ counter + " times in " + str);
    }
}





