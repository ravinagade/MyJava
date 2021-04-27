package inheritance;

public class P {
    int i;
    int j;
    int k;

    public void show(){
        System.out.println("In show");
    }
    public static void main(String[] args){
        P  p= new P();
        p.i=1;
        p.j=2;
    }
}


class Q extends P{
    public static void main(String[] args){
        Q q= new Q();
        q.show();
    }
}


class R extends Q{
    public static void main(String[] args){
        R r= new R();
        r.show();
    }
}
