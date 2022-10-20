package com.atjianyi.Demo01;

/**
 * @author JaneOnly
 * @create_time now()
 */
public class Employee { ///

    private String eId;  //员工工号
    private String eName;  //员工名称
    private String depart; //部门
    private static int eCount; //当前员工数量


    public String geteId() {
        return eId;
    }

    public void seteId(String eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public static int geteCount() {
        return eCount;
    }

    public static void seteCount(int eCount) {
        Employee.eCount = eCount;
    }
}
