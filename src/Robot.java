public class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction){
        this.x = x;
        this.y = y;
        this.direction = direction;
    }


    public Direction getDirection() {
        // текущее направление взгляда
        return direction;
    }

    public int getX() {
        // текущая координата X
        return x;
    }

    public int getY() {
        // текущая координата Y
        return y;
    }

    public void turnLeft() {
        // повернуться на 90 градусов против часовой стрелки
        switch(direction){
            case UP:
                direction = Direction.LEFT;
                break;
            case DOWN:
                direction = Direction.RIGHT;
                break;
            case LEFT:
                direction = Direction.DOWN;
                break;
            case RIGHT:
                direction = Direction.UP;
                break;
        }
    }

    public void turnRight() {
        // повернуться на 90 градусов по часовой стрелке
        switch(direction){
            case UP:
                direction = Direction.RIGHT;
                break;
            case DOWN:
                direction = Direction.LEFT;
                break;
            case LEFT:
                direction = Direction.UP;
                break;
            case RIGHT:
                direction = Direction.DOWN;
                break;
        }
    }

    public void stepForward() {
        switch(direction){
            case UP:
                y++;
                break;
            case DOWN:
                y--;
                break;
            case LEFT:
                x--;
                break;
            case RIGHT:
                x++;
                break;
        }
    }
    public  static void moveRobot(Robot robot, int toX, int toY) {
        while(toX != robot.getX() && toY != robot.getY()){
            if(robot.getX() < toX){
                while(robot.getDirection() != Direction.RIGHT){
                    robot.turnRight();
                }
            }
            else if(robot.getX() > toX){
                while(robot.getDirection() != Direction.LEFT){
                    robot.turnLeft();
                }
            }
            while(robot.getX() != toX){
                robot.stepForward();
                System.out.println("Coords X: " + robot.getX() + " Y: " +  robot.getY());
            }
            System.out.println("Robot in X");
            if(robot.getY() < toY){
                while(robot.getDirection() != Direction.UP){
                    robot.turnRight();
                }
            }
            else if(robot.getY() > toY){
                while(robot.getDirection() != Direction.DOWN){
                    robot.turnLeft();
                }
            }
            while(robot.getY() != toY){
                robot.stepForward();
                System.out.println("Coords X: " + robot.getX() + " Y: " +  robot.getY());
            }
        }
        System.out.println("Robot in finish point");
    }
    // шаг в направлении взгляда
    // за один шаг робот изменяет одну свою координату на единицу
}
