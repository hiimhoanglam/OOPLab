package week7.movable8;
/*
An interface and an abstract class is similar in such that they are basically a blueprint for
subclasses to follow.In addition, they cannot be instantiated
However, an interface only have abstract methods compared to an abstract class which can have their own common features
(methods, constants)
abstract classes methods and members can be of any visibility in comparison with interfaces which has to declare public
visibility
A child class implementing  abstract methods can define them with same/less access modifier while subclasses implementing
interface must define methods with the same visibility
A normal child class when implementing an interface must implement the methods in that interface
A abstract child class when implementing an interface/abstract parent class does not need to define those methods
 */
public class MovableRectangle implements Movable {
    MovablePoint topLeft;
    MovablePoint bottomRight;
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        bottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }
}
