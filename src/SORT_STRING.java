//SORT STRING ACCORDING TO LENGTH OF EACH WORD USING BUBBLE S0RT

public class SORT_STRING {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps upon the lazy dog";
        str = str.toLowerCase();
        String[] arr = str.split(" ");
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j].length()>arr[j+1].length()){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(String i : arr) System.out.println(i);
    }
}
