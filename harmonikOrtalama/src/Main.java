
public class Main {
    public static void main(String[] args) {


        double[] list = {3,5,8,7,9};
        double seri = 0;
        for (int i = 0; i < list.length; i++){
            seri += 1/(list[i]);
        }
        double harmonikOrtalama = list.length / seri;
        System.out.println(harmonikOrtalama);
    }
}