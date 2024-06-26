-- 코드를 입력하세요
SELECT TITLE, BB.BOARD_ID, REPLY_ID, RR.WRITER_ID, RR.CONTENTS, DATE_FORMAT(RR.CREATED_DATE, '%Y-%m-%d') AS CREATED_DATE
FROM USED_GOODS_BOARD AS BB
INNER JOIN USED_GOODS_REPLY AS RR
    ON BB.BOARD_ID = RR.BOARD_ID
WHERE BB.CREATED_DATE LIKE "2022-10-%"
ORDER BY RR.CREATED_DATE, TITLE