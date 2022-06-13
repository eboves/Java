package polymophismExample;

public class Vehicle {
    protected String start;
    protected String stop;
    protected String direction;
    protected String speed;

    public Vehicle(String start, String stop, String direction, String speed) {
        this.start = start;
        this.stop = stop;
        this.direction = direction;
        this.speed = speed;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getStop() {
        return stop;
    }

    public void setStop(String stop) {
        this.stop = stop;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void start(){
        System.out.println(start);
    }
    public void stop(){
        System.out.println(stop);
    }
    public void speed(){
        System.out.println(speed);
    }
    public void description(){
        System.out.println(direction);
    }
}
