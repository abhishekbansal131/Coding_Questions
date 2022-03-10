public class String1 {
    public static String Str(String input1, String input2, int input3, int input4){
        String str = "";
        if(input1.length() > input2.length()){
            str += (input2.charAt(input2.length()-1) + input1);
        }
        else if(input1.length() < input2.length()){
            str += (input1.charAt(input1.length()-1) + input2);
        }
        else{
            if(input1.compareToIgnoreCase(input2)>0){
                str += (input2.charAt(input2.length()-1) + input1);
            }
            else str += (input1.charAt(input1.length()-1) + input2);
        }
        StringBuilder s = new StringBuilder(str);
        for(int i=0; i<str.length(); i++){
            if(Character.isLowerCase(str.charAt(i))){
                s.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            }
            else if(Character.isUpperCase(str.charAt(i))){
                s.setCharAt(i, Character.toLowerCase(str.charAt(i)));
            }
        }
        String p = String.valueOf(input3);
        s.append(p.charAt(input4-1));
        s.append(p.charAt(p.length()-input4));
        return s.toString();
    }
}
