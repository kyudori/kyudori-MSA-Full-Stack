<%@ page contentType="application/json; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>  
<c:catch var="err"> 
	<c:import var="weather"
		url="http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=4413325600">
	</c:import>
	<x:parse varDom="wrss" xml="${weather}"></x:parse>

	<c:set var="wfKor">
		<x:out select="$wrss/rss/channel/item/description/body/data/wfKor" />
	</c:set>
 {
     "time" :  "<x:out select="$wrss/rss/channel/pubDate" />", 
     "temp" : "<x:out
		select="$wrss/rss/channel/item/description/body/data/temp" />",
     "wtext" : "${ wfKor }",
     "img" : <c:choose>
		<c:when test='${ wfKor == "구름 많음"}'>
					"images/cloud.png"
				</c:when>
		<c:when test='${ wfKor == "구름 조금"}'>
					"images/cloud_sun.png"
				</c:when>
		<c:when test='${ wfKor == "맑음"}'>
					"images/sun.png"
				</c:when>
		<c:when test='${ wfKor == "비"}'>
					"images/rain.png"
				</c:when>
		<c:when test='${ wfKor == "눈"}'>
					"images/snow.png"
				</c:when>
		<c:otherwise>
					"images/etc.png"
				</c:otherwise>
	</c:choose>
  }         
</c:catch>
<c:if test="${err!=null}">
   ${err}
</c:if>

