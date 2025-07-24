package Stack;

public class ReverseStack {
    public static void reverse(StackUsingArray st) throws Exception {
        if (st.isEmpty()){
            return;
        }

        int rev = st.pop();
        reverse(st);
        insert(rev, st);
    }
    public static void insert(int x, StackUsingArray st) throws Exception {
        if (st.isEmpty()){
            st.push(x);
            return;
        }

        int remove = st.pop();
        insert(x, st);
        st.push(remove);
    }

    public static void main(String[] args) throws Exception {
        StackUsingArray s = new StackUsingArray(5);

        s.push(12);
        s.push(4);
        s.push(9);
        s.push(10);
        s.push(5);

        s.display();

        reverse(s);

        s.display();
    }
}
