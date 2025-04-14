import java.util.*;

class Occurence{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str[] = (scn.nextLine()).toLowerCase().replace(".", "").split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < str.length; i++){
            if(map.containsKey(str[i])){
                map.put(str[i], map.get(str[i]) + 1);
            }
            else{
                map.put(str[i], 1);
            }
        }
        for(String key : str){
            if(map.containsKey(key)){
                System.out.println(key + " : " + map.get(key));
                map.remove(key);
            }
        }

        System.out.println(str.length);
    }
}