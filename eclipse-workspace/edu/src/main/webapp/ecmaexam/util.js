function write(content, tag) {
	document.write("<"+tag+">"+content+"</"+tag+">");	
}
function hr() {
	document.write("<hr>");
}
function writeColor(content, tag, color) {
	document.write("<"+tag+" style='color:"+color+"'>"+
			  content+"</"+tag+">");	
}
function writeNewLine(content) {
	document.write(content+"<br>");	
}
function getDOM(tag) {
	return document.getElementsByTagName(tag)[0];
}
function getDOMs(tag) {
	return document.getElementsByTagName(tag);
}