  class Message {
        public void printMessage(String message) {
            System.out.println(message);
        }
    
        public void printMessage(int number) {
            System.out.println(number);
        }
    
        public void printMessage(double number) {
            System.out.println(number);
        }
    }
    class calls extends Message{
        public void call(){
            System.out.println("calls");
        }
    }
    public class OverLoadingRiding{
        public static void main(String[] args){
            calls c = new calls();
            c.call();
            c.printMessage(9);
            c.printMessage("Hello Methodoverloading and overriding ");
            c.printMessage(556.456);

        }

    }
