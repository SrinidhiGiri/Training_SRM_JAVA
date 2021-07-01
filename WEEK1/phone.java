abstract class Telephone {
    abstract void lift();
    abstract void disconnected();
}

class SuperTelephone extends Telephone {
    void lift() {
        System.out.println("Lifting");
    }
    void disconnected() {
        System.out.println("Disconnecting");
    }

}

class phone {
    public static void main(String[] args) {
        SuperTelephone obj = new SuperTelephone();
        obj.lift();
        obj.disconnected();

    }

}