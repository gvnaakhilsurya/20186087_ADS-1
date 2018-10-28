/**
 * List of linkeds.
 */
public class LinkedList {

    /**
     * Constructs the object.
     */
    LinkedList() {

    }

    /**
     * Class for node.
     */
    private class Node {

        /**
         * data.
         */
        private int data;
        /**
         * Node Link.
         */
        private Node Link;
        /**
         * Constructs the object.
         *
         * @param      data  The data
         * @param      Link  The Link
         */
        Node(final int data1, final Node Link) {
            this.data = data1;
            this.Link = Link;
        }
    }

    /**
     * Node head.
     */
    private Node head;

    /**
     * Insert the value at a position which the data is given
     * if it is inserted correctly it returns true else false.
     *
     * @param      position  The position
     * @param      data      The data
     *
     * @return     { boolean }
     * By analysis the complexity of the method is O(1). 
     */
    public boolean insertAt(final int position, final int data) {
        boolean flag = false;
        try {
            head = insertHelper(head, position, data);
        } catch (Exception e) {
            System.out.println("Can't insert at this position.");
            flag = true;
        }
        return flag;
    }

    /**
     * Insert helper function.
     *This methosd places the node into the given position.
     *By analysis the order of complexity of the equation is O(N).
     * @param      head1     The head
     * @param      pos      The position
     * @param      element  The element
     *
     * @return     { Node type }
     */
    Node insertHelper(final Node head1, final int pos, final int element) {
        if (pos == 0) {
            return new Node(element, head1);
        }
        head1.Link = insertHelper(head1.Link, pos - 1, element);
        return head1;
    }

    /**
     * Reverse of a LinkedList.
     */
    public void reverse() {
        head = reverseHelper(head);
    }

    /**
     * Reverse LinkedList Helper.
     *
     * @param      head1  The head
     *
     * @return     { Node. }
     */
    Node reverseHelper(final Node head1) {
        if (head1 == null || head1.Link == null) {
            return head1;
        }
        Node nhead1 = reverseHelper(head1.Link);
        head1.Link.Link = head1;
        head1.Link = null;
        return nhead1;
    }
    
    /**
     * It prints the string according to the 
     * parameters of the substring is given to it.
     *
     * @return     { String }
     * By analysis the order of  the method was O(N).
     * 
     * This order of complexity was added to the every
     * metod which calls it.
     */
    public String print() {
        Node thead = head;
        String s  = "";
        while (thead != null) {
            s += thead.data + ", ";
            thead = thead.Link;
        }

        return s.substring(0, s.length() - 2);
    }
}
