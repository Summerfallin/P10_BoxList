package sg.edu.rp.c346.boxlist;

/**
 * Created by 16003749 on 23/7/2018.
 */

public class boxitems {
    private  int num;

    public boxitems(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "boxitems{" +
                "num=" + num +
                '}';
    }
}
