class MethodOverloadingPerformance {

    static int task(int a, int b) {
        return a + b;
    }

    static int task(int a, int b, int c) {
        return (a * b) / c;
    }

    static void task(String msg) {
        System.out.println(msg);
    }

    public static void main(String args[]) {

        float no_of_times = 50;
        float t1 = 0, t2 = 0, t3 = 0;

        long st, et;

        for (int i = 0; i < no_of_times; i++) {
            st = System.currentTimeMillis();
            task(10, 20);
            et = System.currentTimeMillis();

            t1 += (et - st);
        }
        t1 = t1 / no_of_times;

        for (int i = 0; i < no_of_times; i++) {
            st = System.currentTimeMillis();
            task(4, 3, 4);
            et = System.currentTimeMillis();

            t2 += (et - st);
        }
        t2 = t2 / no_of_times;

        for (int i = 0; i < no_of_times; i++) {
            st = System.currentTimeMillis();
            task("Hello Java");
            et = System.currentTimeMillis();

            t3 += (et - st);
        }
        t3 = t3 / no_of_times;

        System.out.println("task(int,int) taking : " + t1 + " Time");
        System.out.println("task(int,int,int) taking : " + t2 + " Time");
        System.out.println("task(String) taking : " + t3 + " Time");
    }
}
