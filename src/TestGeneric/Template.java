package TestGeneric;

public class Template<T> {

    private T data;

    public Template(T data) {
        this.data = data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    void showType(){
        System.out.println(data.getClass().getName());
    }

    @Override
    public String toString() {
        return "Template{" +
               "data=" + data +
               '}';
    }
}
