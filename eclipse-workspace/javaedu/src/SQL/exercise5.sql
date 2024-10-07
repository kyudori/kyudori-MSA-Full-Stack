use edudb;
SELECT * from course1;
select * from course2;
-- 1. course1 을 수강하는 학생들과 course2 를 수강하는 학생들의 이름,  
--    나이를 출력하는데 나이가 적은 순으로 출력하시오.
--    단, 두 코스를 모두 수강하는 학생들의 정보는 한 번만 출력한다.
SELECT name, age 
FROM (
SELECT name, age FROM course1
UNION
SELECT name, age FROM course2
) AS students
ORDER BY age ASC;
-- 2. course1 을 수강하는 학생들과 course2 를 수강하는 학생들의 이름, 전화 번호 그리고 
--    나이를 출력하는데 나이가 많은 순으로 출력하시오.
--    단, 두 코스를 모두 수강하는 학생들의 정보를 중복해서 출력한다. 
SELECT name, phone, age
FROM (
SELECT name, phone, age FROM course1
UNION ALL
SELECT name, phone, age FROM course2
) AS students
ORDER BY age DESC;
-- 3. 직무별 그리고 입사년도별 직원들 수를 출력하는데 직무별 직원수(소합계)와 전체 직원수(전체 합계)도 
--    함께 출력한다.
SELECT job AS "직무", YEAR(hiredate) AS "입사년도", COUNT(*) AS "직원수" 
FROM emp 
GROUP BY job, YEAR(hiredate) WITH ROLLUP;
-- 4. RESEARCH 부서에서 근무하는 직원의 이름, 직무, 부서이름을 출력하시오.
SELECT e.ename AS "이름", e.job AS "직무", d.dname AS "부서이름" 
FROM emp e 
JOIN dept d ON e.deptno = d.deptno 
WHERE d.dname = 'RESEARCH';
select * from dept;
-- 5. 이름에 'A'가 들어가는 직원들의 이름과 부서이름을 출력하시오.
SELECT e.ename AS "이름", d.dname AS "부서이름"
FROM emp e
JOIN dept d ON e.deptno = d.deptno
WHERE e.ename LIKE '%A%';
-- 6. 직원이름과 그 직원이 속한 부서의 부서명, 그리고 월급을 
-- 출력하는데 월급이 3000이상인 직원을 출력하시오. 
SELECT e.ename AS "직원이름", d.dname AS "부서명", CONCAT(FORMAT(e.sal, 0), '원') AS "월급" 
FROM emp e 
JOIN dept d ON e.deptno = d.deptno 
WHERE e.sal >= 3000;
-- 7. 커미션이 책정된 직원들의 직원번호, 이름, 연봉, 연봉커미션,
-- 급여등급을 출력하되, 각각의 컬럼명을 '직원번호', '직원이름',
-- '연봉','실급여', '급여등급'으로 하여 출력하시오. 
-- 또한 실급여가 적은 순으로 출력하시오.
SELECT e.empno AS "직원번호", e.ename AS "직원이름", 
(e.sal * 12) AS "연봉", 
(e.sal * 12) + IFNULL(e.comm, 0) AS "실급여", 
s.grade AS "급여등급" 
FROM emp e 
JOIN salgrade s ON e.sal BETWEEN s.losal AND s.hisal 
WHERE e.comm IS NOT NULL 
ORDER BY "실급여" ASC;
-- 8. 부서번호가 10번인 직원들의 부서번호, 부서이름, 직원이름,
-- 월급, 급여등급을 출력하시오. 
SELECT d.deptno AS "부서번호", d.dname AS "부서이름", e.ename AS "직원이름", 
       e.sal AS "월급", s.grade AS "급여등급" 
FROM emp e 
JOIN dept d ON e.deptno = d.deptno 
JOIN salgrade s ON e.sal BETWEEN s.losal AND s.hisal 
WHERE e.deptno = 10;
-- 9. 직무가 'SALESMAN'인 직원들의 직무와 그 직원이름, 그리고
-- 그 직원이 속한 부서 이름을 출력하시오. 
SELECT e.job AS "직무", e.ename AS "직원이름", d.dname AS "부서이름" 
FROM emp e 
JOIN dept d ON e.deptno = d.deptno 
WHERE e.job = 'SALESMAN';
-- 10. 부서번호가 10번, 20번인 직원들의 부서번호, 부서이름, 
-- 직원이름, 월급, 급여등급을 출력하시오. 그리고 그 출력된 
-- 결과물을 부서번호가 낮은 순으로, 월급이 많은 순으로 정렬하시오. (7개 행)
SELECT d.deptno AS "부서번호", d.dname AS "부서이름", e.ename AS "직원이름", 
       e.sal AS "월급", s.grade AS "급여등급" 
FROM emp e 
JOIN dept d ON e.deptno = d.deptno 
JOIN salgrade s ON e.sal BETWEEN s.losal AND s.hisal 
WHERE e.deptno IN (10, 20) 
ORDER BY d.deptno ASC, e.sal DESC;
-- 11. 사원들의 이름, 부서번호, 부서이름을 출력하시오. 
-- 단, 직원이 없는 부서도 출력하며 이경우 이름을 '없음'이라고 출력한다.     
-- 부서번호별로 정렬한다.
SELECT IFNULL(e.ename, '없음') AS "이름", d.deptno AS "부서번호", d.dname AS "부서이름" 
FROM dept d 
LEFT JOIN emp e ON d.deptno = e.deptno 
ORDER BY d.deptno;
-- 12. 직원들의 이름, 부서번호, 부서이름을 출력하시오. 
-- 단, 아직 부서 배치를 못받은 직원도  출력하며 이경우 부서번호와 부서명은  null 로
-- 출력한다.  또한 직원들의 이름순으로 정렬한다. 
SELECT e.ename AS "이름", e.deptno AS "부서번호", d.dname AS "부서이름" 
FROM emp e 
LEFT JOIN dept d ON e.deptno = d.deptno 
ORDER BY e.ename;
-- 13. 커미션이 정해진 모든 직원의 이름, 커미션, 부서이름, 도시명을 출력하시오.
SELECT e.ename AS "직원명", e.comm AS "커미션", d.dname AS "부서명", l.city AS "도시명" 
FROM emp e 
JOIN dept d ON e.deptno = d.deptno 
JOIN locations l ON d.loc_code = l.loc_code 
WHERE e.comm IS NOT NULL;
-- 14. DALLAS에서 근무하는 사원의 이름,  월급, 등급을 출력하시오.
SELECT e.ename AS "이름", e.sal AS "월급", s.grade AS "등급" 
FROM emp e 
JOIN dept d ON e.deptno = d.deptno 
JOIN locations l ON d.loc_code = l.loc_code 
JOIN salgrade s ON e.sal BETWEEN s.losal AND s.hisal 
WHERE l.city = 'DALLAS';
-- 15. 사원들의 이름, 부서번호, 부서이름을 출력하시오. 
-- 단, 직원이 없는 부서도 출력하며 이경우 직원 이름을 '누구?'라고
-- 출력한다. 아직 부서 배치를 못받은 직원도  출력하며 부서 번호와 부서 이름을
-- '어디?' 이라고 출력한다.     (16행)
-- 부서명을 기준으로 정렬한다.
SELECT IFNULL(e.ename, '누구?') AS "직원명", IFNULL(d.deptno, '어디?') AS "부서번호", 
       IFNULL(d.dname, '어디?') AS "부서명" 
FROM dept d 
LEFT JOIN emp e ON d.deptno = e.deptno 
ORDER BY d.dname;
-- 16. 'CHICAGO' 에서 근무하는 직원들의 이름, 입사날짜, 급여를 출력한다.
--      (서브쿼리로 해결한다.)
SELECT e.ename, e.hiredate, e.sal 
FROM emp e 
WHERE e.deptno = (SELECT d.deptno FROM dept d WHERE d.loc_code = 'C1');
-- 17. 'CHICAGO' 에서 근무하는 직원들의 이름, 입사년도, 부서명을 출력한다.
--      (조인로 해결한다.)
SELECT e.ename, e.hiredate, d.dname 
FROM emp e 
JOIN dept d ON e.deptno = d.deptno 
WHERE d.loc_code = 'C1';
-- 18. 'DALLAS' 에서 근무하는 직원들의 이름, 연봉, 부서명을 연봉이 큰 순으로 출력하는데
--      연봉의 계산은 (급여커미션)12  을 적용하는데 커미션이 정해지지않은 직원은 0으로 계산한다.
SELECT e.ename AS "이름", (e.sal * 12) + IFNULL(e.comm, 0) AS "연봉", d.dname AS "부서명" 
FROM emp e 
JOIN dept d ON e.deptno = d.deptno 
JOIN locations l ON d.loc_code = l.loc_code 
WHERE l.city = 'DALLAS' 
ORDER BY "연봉" DESC;
-- 19 'SEOUL' 에서 근무중인 직원들의 인원을 출력하시오.
SELECT COUNT(*) AS "인원수" 
FROM emp e 
JOIN dept d ON e.deptno = d.deptno 
JOIN locations l ON d.loc_code = l.loc_code 
WHERE l.city = 'SEOUL';