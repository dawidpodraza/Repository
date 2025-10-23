public class Main {
    static void main(String[] args) {

        int[] tab = {12,4325,44,555,665436};

        BigggesNumber bigggesNumber = new BigggesNumber() {

            @Override
            public int takeBiggest(int[] tab) {
                if (tab==null){
                    throw new NullPointerException("argument cannot be null");
                }
                return 0;
            }
        };

    }
}
