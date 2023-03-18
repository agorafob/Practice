package TestRecord;

public record User(String name,String surname) {

    public void fullName(){
        System.out.println(name + " "+ surname);
    }

}
