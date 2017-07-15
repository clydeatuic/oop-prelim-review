package Task2B;
public class Ball {
    double x;
    double y;
    double xSpeed;
    double ySpeed;
    Ball(double x, double y, double xSpeed, double ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        System.out.println("New Ball has been created.");
    }
    double getX(){
        return this.x;
    }
    void setX(double x){
        this.x = x;
    }
    void print(){
        java.text.DecimalFormat df = new java.text.DecimalFormat("#.00");
        String xSpeedTwoDecimalPlaces = df.format(this.xSpeed);
        String ySpeedTwoDecimalPlaces = df.format(this.ySpeed);
        System.out.println("Ball @ ("+this.x+", "+this.y+") with speed ("+xSpeedTwoDecimalPlaces+","+ySpeedTwoDecimalPlaces+")");
    }
    
}
