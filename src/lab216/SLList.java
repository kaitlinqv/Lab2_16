package lab216;

/**
 * Created by Kaitlin on 3/7/2016.
 */
/*********************** SLList.java ***************************
 * generic singly linked list class with head only  stuuuuf
 */
public class SLList {
    protected SLLNode head = null;
    public SLList() {
    }
    public boolean isEmpty() {
        return head == null;
    }
    public Object first() {
        return head.info;
    }
    public void printAll(java.io.PrintStream out) {
        for (SLLNode tmp = head; tmp != null; tmp = tmp.next)
            out.print(tmp.info);
    }
    public void add(Object el) {
        head = new SLLNode(el,head);
    }
    public Object find(Object el) {
        SLLNode tmp = head;
        for ( ; tmp != null && !el.equals(tmp.info); tmp = tmp.next);
        if (tmp == null)
            return null;
        else return tmp.info;
    }
    public Object deleteHead() { // remove the head and return its info;
        Object el = head.info;
        head = head.next;
        return el;
    }
    public void delete(Object el) { // find and remove el;
        if (head != null) // if nonempty list;
            if (el.equals(head.info)) // if head needs to be removed;
                head = head.next;
            else {
                SLLNode pred = head, tmp = head.next;
                for ( ; tmp != null && !(tmp.info.equals(el));
                      pred = pred.next, tmp = tmp.next);
                if (tmp != null) // if found
                    pred.next = tmp.next;
            }
    }
    /****  NEW STUFF  ***/
    public void insertBefore(Object el, SLLNode p ){
        SLLNode prev = head;
        SLLNode tmp = head.next;
        SLLNode newEl = new SLLNode(el,p);
        if(p == head)
            add(el);

        for ( ; tmp != null ;
              prev = prev.next, tmp = tmp.next){
            if(tmp == p)
                prev.next = newEl;

        }

/****/




    }

    public void insertAfter(Object el, SLLNode p ) {

        SLLNode newEl = new SLLNode(el,p);

        newEl.next = p.next;
        p.next = newEl;

    }
}