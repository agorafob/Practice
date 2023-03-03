package TestEnum;

public enum Status {
    ACTIVE,
    PENDING,
    BLOCKED;
    String name;



    public String klichka() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printing(){
        System.out.println(ACTIVE.name);
    }

    @Override
    public String toString() {
        return this.name() + '{' + "name='" + name + '\'' +
                '}';
    }
}