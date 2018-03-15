import java.lang.Integer;
public class LabelTest {
    static int i =0;
    static int j = 0;
    static int k = 0;
    static int m = 0;
    public static void main(String[] args) {
        label_A:
        while(true) {
            boolean isTrue = false;
            //System.out.println("address in memory :"+(i.hashCode()));
            i++;
            j = i++;
            k = k++;
            m = ++m;
            System.out.println(" i ***************    "+i);
            System.out.println(" j ***************    "+j);
            System.out.println(" K ***************    "+k);
            System.out.println(" m ***************    "+m);
            if(i==10){
                break label_A;
            }
            System.out.println(" cannot skip out  ");
        }
    }
}