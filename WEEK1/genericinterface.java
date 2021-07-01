package Training.com;

class genericinterface {
public static void main(String[] args) {
        GenericsClass<Integer> intObj = new GenericsClass<>(2);
        System.out.println("Generic Class returns: " + intObj.getData());
        GenericsClass<String> stringObj = new GenericsClass<>("Srinidhi Giri");
        System.out.println("Generic Class returns: " + stringObj.getData());
        }
        }
class GenericsClass<T> {
    private T data;
    public GenericsClass(T data) {
        this.data = data;
    }
    public T getData() {
        return this.data;
    }
}
