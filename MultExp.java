
/**
 * Write a description of class MultExp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MultExp extends Exp
{
    protected Exp left;
    protected Exp right;
    
    public MultExp(Exp l, Exp r) {
        this.left = l;
        this.right = r;
    }
    
    public void print() {
        System.out.print("(");
        left.print();
        System.out.print(" * ");
        right.print();
        System.out.print(")");
    }
    
    public int evalf() {
        return left.evalf() * right.evalf();
    }
}
