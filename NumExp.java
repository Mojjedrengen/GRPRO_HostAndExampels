
/**
 * Write a description of class NumExp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NumExp extends Exp
{
    protected int num;
    
    public NumExp(int num) {
        this.num = num;
    }
    
    public void print() {
        System.out.print(this.num);
    }
    public int evalf() {
        return this.num;
    }
}
