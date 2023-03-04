package programmer.zaman.now.generic.application;

public class MultipleConstraintApp {
    public static void main(String[] args) {
        // Data<Manager> managerData = new Data<>(new Manager()); // ERROR Manager tidak impelemnt CanSayHello()
        Data<VicePresident> vicePresidentData = new Data<>(new VicePresident());
    }

    public static interface CanSayHello {
        void sayhello(String name);
    }

    public static abstract class Employee {

    }

    public static class Manager extends Employee {

    }

    public static class VicePresident extends Employee implements CanSayHello{
        @Override
        public void sayhello(String name) {
            System.out.println("Hello " + name);
        }
    }

    public static class Data<T extends Employee & CanSayHello>{

        private T data;

        public Data(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
