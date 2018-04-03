import org.jointheleague.graphical.robot.Robot;
public class RobotGraffiti {
	public static void main(String[] args) throws Exception {
		
		Robot echo = new Robot();
		echo.setWindowSize(1600, 1000);
// for (int i=0;i<200;i++) { 
		echo.miniaturize();
		echo.penDown();
		echo.setSpeed(3000);
		echo.move(200);
		echo.turn(90);
		echo.move(100);
		echo.turn(90);
		echo.move(100);
		echo.turn(90);
		echo.move(100);
		echo.turn(180);
		echo.move(100);
		echo.turn(90);
		echo.move(100);
		

		echo.penUp();
		echo.turn(-90);
		echo.move(100);
		echo.penDown();
		echo.turn(-90);
		echo.move(200);
		echo.turn(155);
		echo.move(220);
		echo.turn(-155);
		echo.move(200);
		
		echo.penUp();
		echo.turn(90);
		echo.move(100);
		echo.penDown();
		echo.turn(90);
		echo.move(200);
		echo.turn(180);
		echo.move(200);
		echo.turn(90);
		for (int i=0;i<7;i++) {echo.move(50);
		echo.turn(30);}
		echo.turn(-30);
		for (int i=0;i<7;i++) {echo.move(-50);
		echo.turn(-30);}
	}
}
