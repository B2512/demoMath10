package b2512.yeqingnan;

public class Main {
    public static void main(String[] args) {
        int M = 12;
        int cub = 1; //幼仔
        int adult = 0; //成年
        int sum = 0; //总数
        for (int i = 1; i <= M; i++) {
            //总数
            sum = adult + cub;
            //幼仔
            cub = adult;
            //成兔
            adult = sum;
            System.out.println("第" + i + "个月的对数是：" + sum);
        }
    }
}
