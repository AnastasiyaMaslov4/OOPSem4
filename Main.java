import java.util.ArrayList;

import controllers.CalcController;

public class Main {
    public static <T> void main(String[] args) {

        ArrayList<Integer> example = new ArrayList();
        example.add(8);
        example.add(6);

        CalcController cc = new CalcController();

        System.out.println(cc.multArrbyNum(example, 2).toString());

        ArrayList<Integer> example2 = new ArrayList();
        example2.add(1);
        example2.add(0);

        System.out.println(cc.multArrbyArr(example, example2).toString());

        ArrayList<Integer> example3 = new ArrayList();
        example3.add(2);
        example3.add(4);
        example3.add(6);

        System.out.println(cc.multArrbyArr(example2, example3).toString());

    }
}