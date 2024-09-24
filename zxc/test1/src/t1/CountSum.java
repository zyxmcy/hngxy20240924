package t1;

public class CountSum {
    public void count(String str){
        int big=0, lower=0, blank = 0, number=0, anything=0;
        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i));
            char pre = str.charAt(i);
            if (Character.isLowerCase(pre)){
                System.out.println("isLowerCase-->"+pre);
                lower++;
                }
            else if(Character.isDigit(pre)){
                System.out.println("isDigit-->"+pre);
                number++;
            }else if(Character.isSpaceChar(pre)){
                System.out.println("isLetter-->"+pre);
                blank++;
            }else if(Character.isUpperCase(pre)){
                System.out.println("isUpperCase-->"+pre);
                big++;
            }else {
                System.out.println("anything-->"+pre);
                anything++;
            }
        }
        System.out.println(big+"#"+lower+"#"+blank+"#"+number+"#"+anything);
    };
}
