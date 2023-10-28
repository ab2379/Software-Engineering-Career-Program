public class W04_ReverseString {
    public static void reverse(char[] string){
        int left = 0;
        int right = string.length - 1;

        while(left < right){
            char tmp = string[left];
            string[left] = string[right];
            string[right] = tmp;
            left ++;
            right --;
        }

        System.out.println(string);
    }

    public static void main(String[] args){
        reverse("ana are mere".toCharArray());
    }
}
