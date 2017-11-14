-- Tabel:Person(PersonId,FirstName,LastName)
-- Table:Address(AddressId,PersonId,City,State)

-- 971ms
SELECT p.FirstName,p.LastName,a.City,a.State From Person as p LEFT JOIN Address AS a on P.PersonID = a.PersonId;
