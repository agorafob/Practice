public class GetLastWordLength {
    public static void main(String[] args) {
        String a = "";
        String b = "fefe !!!a";
        String c = "Good buy  ";
        System.out.println(lastWordLength(a));
        System.out.println(lastWordLength(b));
        System.out.println(lastWordLength(c));

    }

    static int lastWordLength(String line){
        line=line.trim();
        int length=0;
        if(line.length()==0){
            return length;
        }else {
            int index = line.length()-1;
            while (index>=0&&!Character.isSpaceChar(line.charAt(index))&&Character.isLetter(line.charAt(index))){
                if(Character.isLetter(line.charAt(index))){
                 length++;
                }
                index--;
            }
        }
        return length;
    }
}
