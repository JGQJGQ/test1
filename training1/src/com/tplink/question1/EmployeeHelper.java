package com.tplink.question1;

public class EmployeeHelper {
    private static volatile EmployeeHelper instance;

    // 私有构造方法防止实例化
    private EmployeeHelper() {}

    public static EmployeeHelper getInstance() {
        if (instance == null) {
            synchronized (EmployeeHelper.class) {
                if (instance == null) {
                    instance = new EmployeeHelper();
                }
            }
        }
        return instance;
    }

    public Employee createEmployee() {
        return new Employee("defaultName", Gender.MALE, "defaultID");
    }
}
