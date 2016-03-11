package lab216;

/**
 * Created by Kaitlin on 3/7/2016.
 */
public class SLLNode {
    public Object info;
    public SLLNode next;
    public SLLNode() {
        next = null;
    }
    public SLLNode(Object el) {
        info = el; next = null;
    }
    public SLLNode(Object el, SLLNode ptr) {
        info = el; next = ptr;
    }
}