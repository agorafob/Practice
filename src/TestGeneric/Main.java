package TestGeneric;

public class Main {
    public static void main(String[] args) {

//        List<Template<?>> list = new ArrayList<>();
//        Template t1 = new Template<>("alik");
//        Template t2 = new Template<>(15);
//        list.add(t1);
//        list.add(t2);
////        System.out.println(t1.getData()/t2.getData());
//        System.out.println(list);
//        t1.showType();
//        t2.showType();
//        System.out.println("------");
//        Integer a = 100;
//        t1.setData(a);
//        t1.showType();
//        t2.showType();
//
//        System.out.println("--------");
//        System.out.println(list.get(0).getClass().getName());
//        System.out.println(list.get(0));

        print1(new D<B>());
//        print1(new D<A>());

        print2(new D<B>());
//        print2(new D<C>());
        C<? extends Number> c = new C<Integer>();
        C<?> e = new C<Integer>();

    }

static void print1 (D<? extends B> val){
    System.out.println(val.getClass());
}

    static void print2 (D<? super B> val){
        System.out.println(val.getClass());
    }


}
