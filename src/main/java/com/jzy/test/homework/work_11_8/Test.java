package com.jzy.test.homework.work_11_8;

// 学生类
class Student {
    private String id;
    private String name;
    private int[] grades;

    public Student(String id, String name, int[] grades) {
        this.id = id;
        this.name = name;
        this.grades = grades;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int[] getGrades() {
        return grades;
    }

    public void printInfo() {
        System.out.println("学号: " + id);
        System.out.println("姓名: " + name);
    }
}

// 评级接口
interface GradeEvaluator {
    void evaluateGrades(int[] grades);
}

// 本科生类
class Undergraduate extends Student implements GradeEvaluator {
    public Undergraduate(String id, String name, int[] grades) {
        super(id, name, grades);
    }

    @Override
    public void evaluateGrades(int[] grades) {
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        double average = total / 3.0;
        if (average >= 80) {
            System.out.println(getName() + "本科生评级为优秀");
        } else if (average >= 70) {
            System.out.println(getName() + "本科生评级为良好");
        } else if (average >= 60) {
            System.out.println(getName() + "本科生评级为一般");
        } else if (average >= 50) {
            System.out.println(getName() + "本科生评级为及格");
        } else {
            System.out.println(getName() + "本科生评级为不及格");
        }
    }
}

// 研究生类
class Graduate extends Student implements GradeEvaluator {
    public Graduate(String id, String name, int[] grades) {
        super(id, name, grades);
    }

    @Override
    public void evaluateGrades(int[] grades) {
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        double average = total / 3.0;
        if (average >= 90) {
            System.out.println(getName() + "本科生评级为优秀");
        } else if (average >= 80) {
            System.out.println(getName() + "本科生评级为良好");
        } else if (average >= 70) {
            System.out.println(getName() + "本科生评级为一般");
        } else if (average >= 60) {
            System.out.println(getName() + "本科生评级为及格");
        } else {
            System.out.println(getName() + "本科生评级为不及格");
        }
    }
}

/**
 * @author jzy
 */ // 测试类
public class Test {
    public static void main(String[] args) {
        // 创建本科生对象并测试评级
        int[] undergradGrades = {85, 90, 88};
        Student undergraduate = new Undergraduate("1001", "张三", undergradGrades);
        undergraduate.printInfo();
        evaluateStudent(undergraduate);

        // 创建研究生对象并测试评级
        int[] gradGrades = {78, 86, 92};
        Student graduate = new Graduate("2001", "李四", gradGrades);
        graduate.printInfo();
        evaluateStudent(graduate);
    }

    // 调用评级方法
    public static void evaluateStudent(Student student) {
        if (student instanceof GradeEvaluator) {
            GradeEvaluator evaluator = (GradeEvaluator) student;
            evaluator.evaluateGrades(student.getGrades());
        } else {
            System.out.println(student.getName() + "不支持评级");
        }
    }
}
