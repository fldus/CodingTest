-- 코드를 입력하세요
SELECT II.NAME, II.DATETIME
FROM ANIMAL_INS II
LEFT JOIN ANIMAL_OUTS OO
    ON II.ANIMAL_ID = OO.ANIMAL_ID
WHERE OO.ANIMAL_ID IS NULL
ORDER BY DATETIME
LIMIT 3;