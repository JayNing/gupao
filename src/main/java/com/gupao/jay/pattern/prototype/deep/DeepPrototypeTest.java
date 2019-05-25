package com.gupao.jay.pattern.prototype.deep;

/**
 * @Author JAY
 * @Date 2019/5/25 19:41
 * @Description TODO
 **/
public class DeepPrototypeTest {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.setName("007");
        RobotFunction robotFunction = new RobotFunction();
        robotFunction.setRead("读");
        robotFunction.setWrite("写");
        robot.setRobotFunction(robotFunction);
        compareClone(robot);
    }

    private static void compareClone(Robot robot) {
        System.out.println("原对象中的引用类型地址：" + robot.getRobotFunction());
        Robot cloneRobot = robot.clone();
        System.out.println("克隆对象中的引用类型地址：" + cloneRobot.getRobotFunction());
        System.out.println("对象地址比较 : " + (robot.getRobotFunction() == cloneRobot.getRobotFunction()));
    }
}
