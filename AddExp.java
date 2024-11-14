
/**
 * Write a description of class AddExp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AddExp extends Exp
{
    protected Exp left;
    protected Exp right;
    
    public AddExp(Exp l, Exp r) {
        this.left = l;
        this.right = r;
    }
    
    public void print() {
        System.out.print("(");
        left.print();
        System.out.print(" + ");
        right.print();
        System.out.print(")");
    }
    
    public int evalf() {
        return left.evalf() + right.evalf();
    }
}
