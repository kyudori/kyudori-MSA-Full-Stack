use edudb;
-- 1. 사원 테이블에서 사원이름을 소문자로 출력하고 컬럼명을 사원이름으로 설정하시오.
SELECT LOWER(ename) AS "사원이름" FROM emp;
-- 2. 사원테이블에서 사원이름과 사원 이름의 두번째 글자부터 다섯번째까지, 앞에서 2개, 뒤에서 3개를
-- 출력하시오.
SELECT ename AS "사원이름", SUBSTRING(ename, 2, 4) AS "2-5문자", 
LEFT(ename, 2) AS "앞에서 2개", 
RIGHT(ename, 3) AS "뒤에서 3개" 
FROM emp;
-- 3. 사원테이블의 사원 이름의 문자 개수를 출력하시오. 컬럼명은 '사원명 문자갯수'
SELECT ename AS "사원명", LENGTH(ename) AS "사원명 문자갯수" FROM emp;
-- 4. 사원테이블에서 사원 이름의 앞 글자 하나와 마지막 글자 하나만 출력하되 
-- 모두 소문자로 각각 출력하시오.
SELECT ename AS "사원명", 
CONCAT(LOWER(LEFT(ename, 1)), LOWER(RIGHT(ename, 1))) AS "결과" 
FROM emp;
-- 5. 3456.78을 반올림하여 소수점 아래 첫번째 자리 까지만 나타내시오.
SELECT ROUND(3456.78, 1) AS "반올림(첫번째 자리까지)";
-- 6. 월급에 50를 곱하고 백단위는 절삭하여 출력하는데 월급뒤에 '원'을 붙이고 
--    천단위마다 ','를 붙여서 출력한다.
SELECT CONCAT(FORMAT(TRUNCATE(sal * 50, -2), 0), '원') AS "계산 결과" FROM emp;
-- 7. 직원 이름과 커미션 설정 여부를 출력하는데 설정되었으면 커미션 값을
--    설정되지 않았으면 '미정'을 출력하시오.
SELECT ename AS "사원명", 
IFNULL(comm, '미정') AS "결과" 
FROM emp;
-- 8. 직원 이름과 커미션 설정 여부를 출력하는데 설정되었으면 '설정됨'을 
--    설정되지 않았으면 '설정안됨'을 출력하시오.
SELECT ename AS "사원명", CASE 
WHEN comm IS NOT NULL THEN '설정됨' 
ELSE '설정안됨' 
END AS "결과" 
FROM emp;
-- 9. 직원 이름과 부서번호 그리고 부서번호에 따른 부서명을 출력하시오.
--    부서가 없는 직원은 '없당' 을 출력하시오.
--    (부서명 : 10 이면 'A 부서', 20 이면 'B 부서', 30 이면 'C 부서')
SELECT ename AS "사원명", deptno, CASE 
WHEN deptno = 10 THEN 'A 부서' 
WHEN deptno = 20 THEN 'B 부서' 
WHEN deptno = 30 THEN 'C 부서' 
ELSE '없당' 
END AS "결과" 
FROM emp;
-- 10. 사원테이블에서 이름의 첫글자가 A이고 마지막 글자가 N이 아닌 사원의
-- 이름을 출력하시오.
SELECT ename 
FROM emp 
WHERE ename LIKE 'A%' 
AND ename NOT LIKE '%N';
-- 11. 직원의 이름,  급여, 연봉을 조회하는 질의를 작성하시오.
-- (단, 직원의 연봉은 200의 월 보너스를 포함하여 계산한다.)
SELECT ename AS "이름", sal AS "급여", (sal * 12) + (200 * 12) AS "연봉" FROM emp;
-- 12.  다음과 같이 급여가 0~1000이면 'A', 1001~2000이면 'B', 2001~3000이면 'C', 
-- 3001~4000이면 'D', 4001이상이면 'E'를 '코드'라는 열에 출력한다.
SELECT ename AS "이름", sal AS "월급", CASE 
WHEN sal BETWEEN 0 AND 1000 THEN 'A' 
WHEN sal BETWEEN 1001 AND 2000 THEN 'B' 
WHEN sal BETWEEN 2001 AND 3000 THEN 'C' 
WHEN sal BETWEEN 3001 AND 4000 THEN 'D' 
ELSE 'E' 
END AS "코드" 
FROM emp;
-- 13. 이름의 두번째 문자가 “A”인 모든 직원의 이름을 조회하는 질의를 작성하시오.
-- (두 개의 SELECT 명령을 작성하는데 하나는 like 연산자를 다른 하나는 함수로 해결하시오)
SELECT ename 
FROM emp 
WHERE ename LIKE '_A%';
-- 
SELECT ename 
FROM emp 
WHERE SUBSTRING(ename, 2, 1) = 'A';
-- 14. 직원의 이름, 급여, 커미션, 연봉을 조회하는 질의를 작성하시오.
-- (단, 직원의 연봉은 (급여+커미션)*12 로 계산하는데 커미션이 정해지지 않은 직원은 0으로 계산한다.)
SELECT ename AS "이름", 
sal AS "급여", 
IFNULL(comm, 0) AS "커미션", 
(sal + IFNULL(comm, 0)) * 12 AS "연봉" 
FROM emp;
