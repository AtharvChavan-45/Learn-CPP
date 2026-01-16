void main() {
     Signal s = new Signal();
     System.out.println(s.get()); //red
     s.next();
     System.out.println(s.get());//green
     s.next();
     s.next();
     System.out.println(s.get()); // red

}

public class Signal {
    private String color;
    public Signal(){
        color = "RED" ;

    }
    public void next(){
        switch(color){
            case "RED" : color = "GREEN" ; break;
            case "GREEN" : color = "YELLOW" ; break;
            case "YELLOW" : color = "RED" ; break;
        }
    }
    public void get(){
        return color;
    }
}

// second method

public class Signal {
    private byte color;
    private static final String[] arr = {"RED","GREEN","YELLOW"};
    public Signal(){
        color = 0;
    }
    public void next(){
        color = (byte)((color + 1) % arr.length);
    }
    public String get(){
        return arr[color];
    }
}