# Table: employee(Id,Salary), find the second Highest Salary In employee table

SELECT Max(Salary) as SecondHighestSalary FROM Employee WHERE Salary NOT IN (SELECT Max(Salary) FROM Employee);
