package hwWekk02.calculator;

/**
 * Created by Denni on 9/29/2016.
 */
public class OperationWrapper {
    private int x;
    private int y;

    public OperationWrapper() {
    }

    public OperationWrapper(int x) {
        this.x = x;
    }


    public OperationWrapper(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
