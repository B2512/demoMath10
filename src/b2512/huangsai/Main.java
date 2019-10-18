package b2512.huangsai;
/*
有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少?
幼仔对数=前月成兔对数
成兔对数=前月成兔对数+前月幼仔对数
总体对数=本月成兔对数+本月幼仔对数
 */

public class Main {
    public static void main(String[] args) {
        int Pups = 1; //幼
        int adult = 0; //成
        int Total;  //总
        for (int i=1;i<=12; i++){
            Total = adult+Pups; // 1=0+1
//            System.out.println("幼:"+Pups);
//            System.out.println("成:"+adult);
            Pups = adult; //1
            adult = Total; //2
            System.out.println("第"+i+"个月生的兔子对数为:"+Total);
        }
    }
}
