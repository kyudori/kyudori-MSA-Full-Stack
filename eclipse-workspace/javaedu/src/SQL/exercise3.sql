use edudb;
-- 1. 오늘날짜와 오늘날짜에서 10일을 더한 날짜를 출력하는 SQL 명령을 작성하시오.
SELECT CURRENT_DATE AS "오늘 날짜", CURRENT_DATE + INTERVAL 10 DAY AS "10일 후의 날짜";
-- 2. 현재 시간을 "....년 ..월 ..일 ..시 ..분" 으로 출력하는 SQL 명령을 작성하시오. 컬럼명은 "현재시간"으로 설정한다.
SELECT DATE_FORMAT(NOW(), '%Y년 %m월 %d일 %H시 %i분') AS "현재시간";
-- 3.   모든 직원의 이름과 현재까지의 입사기간을 월단위로 조회하는 SQL  명령을 작성하시오.
--   (이때, 입사기간에 해당하는 열별칭은 “MONTHS WORKED”로 하고,   
--  입사기간이 가장 큰 직원순(입사한지 오래된 순)으로 정렬한다.)
--  결과는 테스트하는 날짜에 따라서 다를 수 있음...ㅎ
SELECT ename, TIMESTAMPDIFF(MONTH, hiredate, CURDATE()) AS "MONTHS WORKED" 
FROM emp 
ORDER BY "MONTHS WORKED" DESC;
-- 4. 사원테이블에서 사원이름과 사원들의 오늘 날짜까지의 근무일수를 구하는 SQL 명령을 작성하시오.시오.
--  결과는 테스트하는 날짜에 따라서 다를 수 있음...ㅎ
SELECT ename AS "사원이름", DATEDIFF(CURDATE(), hiredate) AS "근무일수" 
FROM emp;
-- 5. 1981년도에 입사한 직원들의 이름, 직무 그리고 입사일을 입사한 순으로 출력하는 SQL  명령을 작성하시오.
SELECT ename, job, hiredate 
FROM emp 
WHERE YEAR(hiredate) = 1981 
ORDER BY hiredate;
-- 6. 내 생일을 기준으로 요일을 출력하는 SQL 명령을 작성하시오.(요일을 숫자로)
SELECT DAYOFWEEK('1997-04-06') AS "요일숫자";
-- 7. 내 생일을 기준으로 요일을 출력하는 SQL 명령을 작성하시오.(요일을 요일명으로)
SELECT TIMESTAMPDIFF(MONTH, '1997-04-06', CURDATE()) AS "태어난지 몇개월";
-- 8. 현재를 기준으로 내가 태어난지 몇 개월 되었는지 알 수 있는 SQL 명령을 작성하시오.
SELECT empno, ename, sal 
FROM emp 
WHERE sal > (SELECT AVG(sal) FROM emp) 
ORDER BY sal DESC;
-- 9. 평균급여보다 많은 급여를 받는 직원들의 직원번호, 이름, 월급을
-- 출력하되, 월급이 높은 사람 순으로 출력한다.
SELECT empno, ename, sal 
FROM emp 
WHERE sal > (SELECT AVG(sal) FROM emp) 
ORDER BY sal DESC;
-- 10. 30번 부서의 직원들과 동일한 해에 입사한 직원들의 이름, 월급, 
--   부서번호 그리고 입사년도를 출력하는 SQL 명령을 작성하시오.(30번부서 직원들은 제외하고)
--   또한 월급을 적게 받는 순으로 출력한다.   
SELECT ename, sal, deptno, YEAR(hiredate) AS "HireYear" 
FROM emp 
WHERE YEAR(hiredate) = (SELECT YEAR(hiredate) FROM emp WHERE deptno = 30 LIMIT 1) 
AND deptno != 30 
ORDER BY sal ASC;
-- 11. 'BLAKE'와 같은 부서에 있는 직원들의 이름과 입사일을 뽑는데 'BLAKE'는 빼고 출력하는 SQL  명령을 작성하시오.
SELECT ename, hiredate 
FROM emp 
WHERE deptno = (SELECT deptno FROM emp WHERE ename = 'BLAKE') 
AND ename != 'BLAKE';
-- 12. 이름에 'T'를 포함하고 있는 직원들과 같은 부서에서 근무하고
--   있는 직원의 직원번호와 이름을 출력하는 SQL 명령을 작성하시오.(출력 순서 무관)
SELECT empno, ename 
FROM emp 
WHERE deptno = (SELECT deptno FROM emp WHERE ename LIKE '%T%');
-- 13 급여가 평균급여보다 많고,이름에 S자가 들어가는 직원과 동일한
--  부서에서 근무하는 모든 직원의 직원번호,이름 및 급여를 출력하는 SQL 명령을 작성하시오.(출력 순서 무관)
SELECT empno, ename, sal 
FROM emp 
WHERE deptno IN (SELECT deptno FROM emp WHERE sal > (SELECT AVG(sal) FROM emp) AND ename LIKE '%S%');
-- 14. 30번 부서에 있는 직원들 중에서 가장 많은 월급을 받는 직원보다
--   많은 월급을 받는 직원들의 이름, 부서번호, 월급을 출력하는 SQL 명령을 작성하시오.
--   (단, ALL 또는 ANY 연산자를 사용할 것)
SELECT ename, deptno, sal 
FROM emp 
WHERE sal > ALL (SELECT MAX(sal) FROM emp WHERE deptno = 30);
-- 15. SALES 부서에서 일하는 직원들의 부서번호, 이름, 직업을 출력하는 SQL 명령을 작성하시오.
SELECT deptno AS "부서 정보", ename AS "직원명", job AS "직무" 
FROM emp 
WHERE deptno = 30;
-- 16. 'KING'에게 보고하는 모든 직원의 이름과 입사날짜를 출력하는 SQL 명령을 작성하시오. 
--     (KING에게 보고하는 직원이란 mgr이 KING인 직원을 의미함) 
SELECT ename AS "이름", hiredate AS "입사날짜" 
FROM emp 
WHERE mgr = (SELECT empno FROM emp WHERE ename = 'KING');
-- 17. 이름의 글자 갯수가 5 개 초과인 직원들의 정보만 출력하는 SQL 명령을 작성하시오.
SELECT * 
FROM emp 
WHERE LENGTH(ename) > 5;
