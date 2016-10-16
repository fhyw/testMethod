package EmployeeTest;

import Base.BaseTest;
import core.EmpBusinessLogic;
import core.EmployeeDetails;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Created by fangxue on 16/10/16.
 */
public class EmployeeDetailTest extends BaseTest{

    EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
    EmployeeDetails employee = new EmployeeDetails();

    @Test
    public void testCalculateAppriasal() {

        employee.setName("Rajeev");
        employee.setAge(25);
        employee.setMonthlySalary(8000);

        double appraisal = empBusinessLogic.calculateAppraisal(employee);
        Assert.assertEquals(500, appraisal, 0.0, "500");
    }

    // Test to check yearly salary
    @Test
    public void testCalculateYearlySalary() {

        employee.setName("Rajeev");
        employee.setAge(25);
        employee.setMonthlySalary(8000);

        double salary = empBusinessLogic.calculateYearlySalary(employee);
        Assert.assertEquals(96000, salary, 0.0, "8000");
    }

    @Test
    public void test_01_计算appriasal () {

    }

}
