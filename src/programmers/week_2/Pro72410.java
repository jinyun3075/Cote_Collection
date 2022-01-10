package programmers.week_2;

public class Pro72410 {
    public static void main(String[] args) {
        String new_id ="...!@BaT#*..y.abcdefghijklm";
        System.out.println(solution(new_id));
    }
    public static String solution(String new_id) {
        String taget = new_id;
        taget = taget.toLowerCase();
        taget = taget.replaceAll("[^-_.a-z0-9]","");
        taget = taget.replaceAll("[.]{2,}",".");
        taget = taget.replaceAll("^[.]|[.]$","");
        if(taget.equals("")){
            taget+="a";
        }
        if(taget.length()>15){
            taget=taget.substring(0,15);
            taget = taget.replaceAll("[.]$","");
        }
        while(taget.length()<3){
            taget+=taget.charAt(taget.length()-1);
        }
        return taget;
    }
}
