public class PalindromicNumbers {
    private int[] list;

    public PalindromicNumbers(int numPalindromes, int start) {
        list = new int[numPalindromes];
        for (int index = 0; index < list.length; index++) {
            //if(isPalindrome(start)){
            list[index] = start;
            //else{
            index--;
        }
    }
}
