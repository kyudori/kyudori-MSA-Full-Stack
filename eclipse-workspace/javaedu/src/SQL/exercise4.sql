use edudb;
-- 1. 'ALLEN'  과 같은 부서에 근무하는 직원들의 모든 정보를 출력한다.
--    (단, 'ALLEN'의 정보는 제외한다.)
SELECT * 
FROM emp 
WHERE deptno = (SELECT deptno FROM emp WHERE ename = 'ALLEN') 
AND ename != 'ALLEN';
-- 2. 'KING'  과 같은 해에 입사한 직원들의 모든 정보를 출력한다.
--    (단, 'KING'의 정보는 제외한다.)
SELECT *
FROM emp
WHERE YEAR(hiredate) = (SELECT YEAR(hiredate) FROM emp WHERE ename = 'KING') 
AND ename != 'KING';
-- 3. 1982년도에 입사에 입사하지 않은 직원들 중에서1982년도에 입사한 직원들이 받는 최대 급여와 동일하거나  
--     더 많은 급여를 받는 직원들의 모든 정보를 출력한다.
--    (단, 문제해결시 2가지 방법으로 해결하는데 그룹(집계)함수를 사용해서도 해결하고 사용하지 않고도 해결한다.)  
SELECT *
FROM emp
WHERE sal >= (SELECT MAX(sal) FROM emp WHERE YEAR(hiredate) = 1982) 
AND YEAR(hiredate) != 1982;
--
SELECT * 
FROM emp 
WHERE sal >= 3000 
AND YEAR(hiredate) != 1982;
-- 4. 4월에 입사하지 않은 직원들 중에서 4월에 입사한 직원들이 받는 최소 급여보다 많은 급여를 받는 
--    직원들의 모든 정보를 출력한다.
--    (단, 문제해결시 2가지 방법으로 해결하는데 그룹(집계)함수를 사용해서도 해결하고 사용하지 않고도 해결한다.) 
SELECT *
FROM emp
WHERE sal >= (SELECT MAX(sal) FROM emp WHERE MONTH(hiredate) = 4) 
AND MONTH(hiredate) != 4;
--
SELECT * 
FROM emp 
WHERE sal > 1250 
AND MONTH(hiredate) != 4;
-- 5. 모든 직원들 급여의 평균을 구한다. 
--    (소수점 이하 둘째자리까지만 나타내고 셋째자리 부터는 절삭한다)
SELECT ROUND(AVG(sal), 2) AS "전직원 급여 평균" 
FROM emp;
-- 6. 모든 직원들이 받는 커미션의 합을 구한다.
SELECT SUM(comm) AS "커미션 합" 
FROM emp 
WHERE comm IS NOT NULL;
-- 7. 모든 직원들의 수를 구한다.
SELECT count(*) AS "직원수"
FROM emp;
-- 8. 다음과 같이 커미션이 정해진 직원수와 부서가 정해진 직원수를 출력한다.
SELECT 
(SELECT COUNT(*) FROM emp WHERE comm IS NOT NULL) AS "커미션이 정해진 직원수", 
(SELECT COUNT(*) FROM emp WHERE deptno IS NOT NULL) AS "부서가 정해진 직원수";
-- 9. 각 직무별로 급여합을 출력하되 급여합이 낮은 순으로 출력한다.
SELECT job, SUM(sal) AS "급여합" 
FROM emp 
GROUP BY job 
ORDER BY SUM(sal) ASC;
-- 10. 각 부서에서 근무하는 직원들의 인원수를 알고싶다. 다음 형식으로 출력하는 SQL
--    을 작성한다 .
SELECT 
    CASE 
        WHEN deptno IS NULL THEN '미정' 
        ELSE CONCAT(deptno, '번 부서') 
    END AS "부서 정보", 
    COUNT(*) AS "직원 수" 
FROM emp 
GROUP BY deptno;
-- 11. 년도별로 몇명이 입사했는지 알고싶다. 다음 형식으로 출력하는 SQL
--    을 작성한다 . (많이 입사한 순으로 출력)
SELECT YEAR(hiredate) AS "입사년도", COUNT(*) AS "입사직원수" 
FROM emp 
GROUP BY YEAR(hiredate) 
ORDER BY COUNT(*) DESC;
-- 12. 직무별 급여 총액을 출력하되, 직무가 'MANAGER'인 직원들은 제외한다. 
--   그리고 급여총액이 5000보다 큰 직급과 총급여만 출력한다.
SELECT job, SUM(sal) AS "급여 총액" 
FROM emp 
WHERE job != 'MANAGER' 
GROUP BY job 
HAVING SUM(sal) > 5000;
-- 13. 30번 부서의 직무별 급여의 평균을 알고자 한다.
-- 급여계산은 급여+커미션(null이면 0으로 계산)이며 
-- 출력 양식은 소수점 이하 두 자리(반올림)까지 통일된 양식으로 출력한다.
SELECT job, ROUND(AVG(sal + IFNULL(comm, 0)), 2) AS "평균급여" 
FROM emp 
WHERE deptno = 30 
GROUP BY job;
-- 14. 직무별 급여의 합을 출력하는데 급여합이 5000을 초과하는 직무에 대해서만 출력한다.
SELECT job, SUM(sal) AS "급여의 합" 
FROM emp 
GROUP BY job 
HAVING SUM(sal) > 5000;
-- 15. RESEARCH 부서에서 근무하는 직원들의 직원 성명, 입사 날짜 그리고 부서 번호를 출력한다.
SELECT ename AS "직원 성명", hiredate AS "입사 날짜", deptno AS "부서 번호" 
FROM emp 
WHERE deptno = (SELECT deptno FROM dept WHERE dname = 'RESEARCH');
-- 16. 평균급여보다 많은 급여를 받는 직원들의 직원번호, 이름, 급여를
-- 출력하되, 급여가 높은 사람 순으로 출력한다.
SELECT empno, ename, sal 
FROM emp 
WHERE sal > (SELECT AVG(sal) FROM emp) 
ORDER BY sal DESC;
