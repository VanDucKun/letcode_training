class Solution {
    public String reverseWords(String s) {
        Scanner tmp = new Scanner(s);   //Create a Scanner object with the string s
        String result = "";
        while(tmp.hasNext()){   // While have a next word in string s
            result = tmp.next() + " " + result; //Take the next string and append to the original result
        }
        return result.trim();
    }
}