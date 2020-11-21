import java.io.*;
class Robot1 {
	int x = 0;
	int y = 0;
	Direction dir = Direction.UP;

	public enum Direction {
		UP,
		DOWN,
		LEFT,
		RIGHT
	}

    public Direction getDirection() {
		return dir;
        // текущее направление взгляда
    }

    public int getX(int tmp) {
		x = tmp;
		return x;
        // текущая координата X
    }

    public int getY(int tmp) {
		y = tmp;
		return y;
        // текущая координата Y
    }

    public void turnLeft() {
        // повернуться на 90 градусов против часовой стрелки
    }

    public void turnRight() {
        // повернуться на 90 градусов по часовой стрелке
    }

    public void stepForward() {
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
    }
}
