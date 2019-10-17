package b2512.wuzhangjie;

public class Main {
    public static void main(String[] args) {
        int zongshu = 0;//总数
        int cheng = 1;//成兔
        int you = 0;//幼兔
        for (int i=1;i<=12;i++){//从1月开始 最大12个月
            zongshu = cheng+you;//总数等于(成兔+幼兔)
            System.out.println(i+"个月的兔子总数为:"+zongshu);
            cheng = you;//成兔 = 幼兔
            you = zongshu; //幼兔 = 当前的总数
        }
    }
}
