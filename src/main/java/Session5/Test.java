package Session5;

public class Test {
    public static void main(String[] args) {
        String s = "Twt";
        char charArray[] = new  char[s.length()];
        for (int i = 0; i < s.length(); i++){
            charArray[i] = s.charAt(s.length()-1-i);
        }
        for (int i = 0; i<= s.length()-1; i++){
            System.out.println(charArray[i]);
        }
        String f = new String(charArray);
        System.out.println(f);
        if(s.equalsIgnoreCase(f)){
            System.out.println("This string is palendrome");
        }else {
            System.out.println("This string is not palendrome");
        }
    }
}
