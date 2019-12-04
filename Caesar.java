public class Caesar{

     public static void main(String []args){
        String input = args[0];
        String caesar = new String();
        int shift = Integer.parseInt(args[1]);
        for(int i=0;i<input.length();i++){
            caesar = caesar + char_shift(input.charAt(i),shift);
        }
        System.out.println(caesar);
     }
     
     public static char char_shift(char a, int shift) {
         String alphabet = "abcdefghijklmnopqrstuvwxyz";
         for(int i=0;i<alphabet.length();i++){
             if(alphabet.charAt(i)==a){
                 return alphabet.charAt((i+shift)%alphabet.length());
             }
         }
         return '0';
     }
}
