var device;
var drawing = false;
var canvas;
var context;
var rect;
var drawColor="black";
function setColor(color) {
	drawColor = color;	
}
function initialize() {
    context.clearRect(0,0,580,450);
    context.beginPath();
    context.rect(0,0,580,450);
    context.strokeStyle = "silver";
    context.fillStyle = "LightGoldenrodYellow";
    context.fill();
    context.lineWidth = 0.5;
    for(i=1;i<=8;i++) {
        context.moveTo(5,i*50);
        context.lineTo(575, i*50);
    }
    context.stroke();
}
function startDrawing() {
    drawing = true;
    context.beginPath();
    context.strokeStyle = drawColor;
    context.lineWidth = 1;
    context.arc(event.clientX - rect.left, event.clientY - rect.top, 3, 0, 2*Math.PI)
    context.stroke();
    context.fillStyle = drawColor;
    context.fill();
    context.closePath();
    context.beginPath();
    context.moveTo(event.clientX - rect.left, event.clientY - rect.top);
    context.lineCap = "round";
    context.lineWidth = 6;
}
function keepDrawing() {
    if (drawing) {
        var x,y;
        if (device == "mobileDevice") {
            x = event.targetTouches[0].pageX;
            y = event.targetTouches[0].pageY;
        }
        else {
            x = event.clientX;
            y = event.clientY;
        }
        context.lineTo(x - rect.left, y - rect.top);
        context.stroke();
    }
}
function stopDrawing() {
    if (drawing) {
        context.stroke();
        drawing = false;
    }
}
function save() {	
    //alert(canvas.toDataURL()); 
    localStorage.setItem("canvas", canvas.toDataURL());    
}
function restore() {
	var img = new Image();
    img.src = localStorage.getItem("canvas");
    img.onload = function() {
    	context.drawImage(img, 0, 0);        
    }
}
function upload() {
	var data = new FormData();
	var myblob = new Blob([canvas.toDataURL()], {type : 'text/plain'});
	data.append('mfile', myblob, "test.png");
	var xhr = new XMLHttpRequest();
	xhr.onload=function() {
		if(xhr.responseText == "OK")
			alert("UPLOAD SUCCESS");
		else 
			alert("UPLOAD FAIL");
		};
	xhr.open("POST", "/canvasupload", true);
	xhr.send(data);  
	
}
function downimage() {
	var xhr = new XMLHttpRequest();
	xhr.onload=function() { 
        var img = new Image();
        //alert(xhr.responseText);
        img.onload = function() {
        	context.drawImage(img, 0, 0);
        }
        img.src = xhr.responseText;       
	}
	xhr.open("GET", "/canvasdownload", true);
	xhr.send();  
	   
}
function getDeviceType() {
    var str = navigator.userAgent;
    if (str.match(/(ipad)|(iphone)|(ipod)|(android)|(webos)/i))
        device = "mobileDevice";
    else
        device = "desktopPC";
}
function startMemo() {
	getDeviceType();
	canvas = document.getElementById("myCanvas");
	if (device == "mobileDevice") {
		canvas.ontouchstart = startDrawing;
		canvas.ontouchmove = keepDrawing;
		canvas.ontouchend = stopDrawing;
	} else {
		canvas.onmousedown = startDrawing;
		canvas.onmousemove = keepDrawing;
		canvas.onmouseup = stopDrawing;
	}    
    context = canvas.getContext("2d"); 
    rect = canvas.getBoundingClientRect();
    initialize();
}
getDeviceType();
document.body.onload = startMemo;




