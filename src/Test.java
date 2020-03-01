public class Test {

    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        VisualAccumulator v = new VisualAccumulator(T, 1.0);

        for (int i = 0; i < T; i++) {
            v.addDataValue(StdRandom.random());
        }

        StdOut.println(v);
    }
}
