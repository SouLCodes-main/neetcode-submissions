class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");

        char[] arrr = arr[arr.length - 1].toCharArray();
        return arrr.length;
    }
}