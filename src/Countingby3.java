public class Countingby3 {
    public static void main(String [] args){
        for(int i=0; i<=18; i+=3){
            System.out.println(i);

        }
        for(int i=0; i<=18; i++){
            if (i %2 == 0){
                break;
            }
            System.out.println(i);
        }
    }
}