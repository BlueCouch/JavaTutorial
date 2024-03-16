// package enum;

enum Status {
    Running, Failed, Pending, Success;
}




public class Demo {
    public static void main(String[] args) {
        
        
        Status s = Status.Running;
        
        System.out.println(s.ordinal());

        Status[] st = Status.values();

        for (Status sg : st) {
            System.out.println(sg + " : " + sg.ordinal());
        }

    }
}

// Status is a class and all these are objects of Status