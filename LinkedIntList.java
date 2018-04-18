package Chapter16.exercise2;

public class LinkedIntList
{
    /*
    Write a method called toString that returns a string representation of the list, such as "[5, -2, 9]".
     */
    private ListNode front;

    //  Exercise 2
    @Override
    public String toString()
    {
        if (this.front == null)
        {
            return "[]";
        }
        else
        {
            String result = "[" + front.getData();
            ListNode current = this.front.next;

            while (current != null)
            {
                result += ", " + current.getData();
                current = current.next;
            }
            result += "]";
            return result;
        }
    }

    public LinkedIntList()
    {
        this.front = null;
    }

    public void add(int value)
    {
        if(this.front == null)
            this.front = new ListNode(value);
        else
        {
            ListNode current = this.front;

            while (current.next != null)
            {
                current = current.next;
            }

            current.next = new ListNode(value);
        }
    }
}
