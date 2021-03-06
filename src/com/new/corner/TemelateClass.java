import java.util.ArrayList;

/**
 * @author shkstart
 * @date 2021/3/3 -  17:37
 */
public class TemelateClass {

    //prsf
    private static final HelloWord cust = new HelloWord();

    //psf
    public static final int NUM = 1;

    //psfi
    public static final int NUM2 = 1;

    //psfs
    public static final String NUM3 = "1";


    //psvm
    public static void main(String[] args) {




        //sout
        System.out.println();
        System.out.println("args = [" + args + "]");
        System.out.println("TemelateClass.main");
        int v = 10;
        System.out.println("v = " + v);
        System.out.println(v);


        //fori
        String[] arr = new String[]{"Tom","Jerry","aaa","bbb"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("i = " + i);
            System.out.println("args = [" + args + "]");
            System.out.println("TemelateClass.main");
        }

        //iter
        for (String s : arr) {
            //s.sout
            System.out.println(s);
        }

        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        for (Object o : list) {

        }

        //list.fori
        for (int i = 0; i < list.size(); i++) {

        }

        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }

        //ifn
        if (list == null) {

        }

        //inn
        if (list != null) {

        }

        //xxx.nn / xxx.null
        if (list != null) {

        }
        if (list == null) {

        }


    }

}
