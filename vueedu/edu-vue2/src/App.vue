<template>
  <nav>
    <router-link to="/">Home</router-link> |
    <router-link to="/study1">Study1</router-link> |  
    <router-link to="/study2">Study2</router-link> |    
    <router-link to="/study3">Study3</router-link> |      
    <router-link to="/study4">Study4</router-link> |   
    <router-link to="/work">Work</router-link> |
    <router-link to="/study5">Study5(쿠키)</router-link> |     
    <router-link to="/study6">Study6(헤더)</router-link> |      
  </nav>
  <br>
  <router-view />
</template>


<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

nav {
  padding: 10px;
}

nav a {
  font-weight: bold;
  color: #2c3e50;
}

nav a.router-link-exact-active {
  color: #42b983;
}

button {
	cursor: pointer;
	padding: 6px 12px;
	margin-right : 5px;
	border-radius: 6px;
	color: #fff;
	border: 2px;
	background-color: #007bff;
	transition: background-color .2s
}
button:hover {
	background-color: #0069d9;
}
button:active {
	background-color: #003c7c;
}
button:disabled {
	opacity: .5;
	pointer-events: none;
}

input {
	padding: 5px 10px;
	border-radius: 6px;
	color: #495057;
	border: 2px solid #ced4da;
}
</style>

