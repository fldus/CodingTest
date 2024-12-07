SELECT DATE_FORMAT(DATETIME, '%H') AS HOUR, COUNT(*) AS COUNT
FROM ANIMAL_OUTS
WHERE TIME(DATETIME) BETWEEN '09:00:00' AND '19:59:59'
GROUP BY HOUR
ORDER BY HOUR