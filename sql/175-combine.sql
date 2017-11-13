-- Tabel:Person(PersonId,FirstName,LastName)
-- Table:Address(AddressId,PersonId,City,State)

# Write your MySQL query statement below
SELECT p.FirstName,p.LastName,a.City,a.State From Person as p LEFT JOIN Address AS a on P.PersonID = a.PersonId;
