-- Table:Logs
SELECT DISTINCT Logs1.Num as ConsecutiveNums
FROM Logs as Logs1, Logs as Logs2, Logs as Logs3
WHERE Logs1.id = Logs2.id-1 AND Logs2.id = Logs3.id-1  AND Logs1.Num = Logs2.Num AND Logs2.Num = Logs3.Num;
