package Stack;

public class DynamicStackClient {
    public static void main(String[] args) throws Exception {
        DynamicStack st = new DynamicStack();

        st.push(1);
        st.push(0);
        st.push(1);
        st.push(0);
        st.push(0);
        st.push(0);
        st.push(1);
        st.push(1);

        st.display();
    }
}
