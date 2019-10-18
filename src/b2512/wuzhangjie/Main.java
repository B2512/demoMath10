package b2512.wuzhangjie;

public class Main {
    public static void main(String[] args) {
        int zongshu = 0;//总数
        int you = 1;//幼兔一对
        int cheng = 0;//成年兔
        for (int i=1;i<=12;i++){
            zongshu = you+cheng;
            System.out.println(i+"个月的兔子总数为"+zongshu);
            System.out.println("幼兔:"+you);
            you = cheng;//前月成兔对数
            System.out.println("成年兔:"+cheng);
            cheng = zongshu;//成年兔等于上个月的兔子总量
        }
    }
}
