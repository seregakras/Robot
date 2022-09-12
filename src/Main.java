public class Main {
    public static void main(String[] args) {
       // Robot robot = new Robot(0, 0, Direction.UP);
       // Robot.moveRobot(robot, 3,5);
       test();

    }
    public static void test() {

        // тестовые данные (начальная позиция и массив конечных позиций)
        int x = -1, y = 1;
        int[][] arr = new int[][]{{3, 1}, {-3, 1}, {3, -1}, {-3, -1}};

        System.out.println("Начальная позиция робота: x = " + x + " ; y = " + y + "\n");

        for (int i = 0; i < arr.length; i++) {
            int toX = arr[i][0];
            int toY = arr[i][1];
            System.out.println("Конечная позиция робота: toX = " + toX + " ; toY = " + toY);
            for (Direction direction : Direction.values()) {
                System.out.print("Направление: " + direction + "; ");
                Robot robot = new Robot(x, y, direction);
                Robot.moveRobot(robot, toX, toY);
                System.out.println("результат - " + (robot.getX() == toX && robot.getY() == toY) + " (x = " + robot.getX() + "; y = " + robot.getY() + ")");
            }
            System.out.println();
        }
    }
}
