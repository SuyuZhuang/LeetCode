-- Table: Scores

select Score, (SELECT COUNT(DISTINCT Score) FROM Scores WHERE Score>= s.Score) as Rank  FROM Scores s Order By Score DESC;
