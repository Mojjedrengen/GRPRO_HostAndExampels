
/**
 * Write a description of class DivExp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DivExp extends Exp
{
    protected Exp left;
    protected Exp right;
    
    public DivExp(Exp l, Exp r) {
        this.left = l;
        this.right = r;
    }
    
    public void print() {
        System.out.print("(");
        left.print();
        System.out.print(" / ");
        right.print();
        System.out.print(")");
    }
    
    public int evalf() {
        if (right.evalf() == 0) throw new ArithmeticException("/");
        return left.evalf() / right.evalf();
    }
}
