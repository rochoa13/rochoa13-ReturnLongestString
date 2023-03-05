
public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr){
        String longestString = arr[0]; //setting the first index string to a variable that will be compared to another string

        for(int i = 0; i < arr.length; i++){
            String iterationString = arr[i]; //this string var updates with the for loop and holds the string of the current iteration index
            
            if(iterationString.length() > longestString.length()){ // comparing iteration string to previously longest string
                longestString = iterationString; //updating the longest string if iteration string is longer
            }

        }
        return longestString;
    }
}
