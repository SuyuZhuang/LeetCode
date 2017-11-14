-- Table: employee(Id,Salary), find the second Highest Salary In employee table
-- use NOT IN, 1292ms
SELECT Max(Salary) as SecondHighestSalary FROM Employee WHERE Salary NOT IN (SELECT Max(Salary) FROM Employee);

-- use < , 938ms
SELECT Max(Salary) as SecondHighestSalary FROM Employee WHERE Salary < (SELECT Max(Salary) FROM Employee);
