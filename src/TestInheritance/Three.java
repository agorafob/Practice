package TestInheritance;

public interface Three extends One, Two {
    @Override
    default void one() {
        System.out.println("One from three");
    }

    @Override
    default void two() {
        Two.super.two();
    }

    @Override
    default void log() {
        Two.super.log();
    }

    @Override
    double add(int a);

    @Override
    double multiply(int a);

    @Override
    double substruct(int a);

    @Override
    double addTWo(int a);

    @Override
    double multiplyTwo(int a);

    @Override
    double substructTwo(int a);

    //    @Override
//    default void two() {
//        System.out.println("Two from three");
//    }
}
