<template>
    <header>	
		<h1 class="target">레이아웃 나누기</h1>
		<em>오늘은 <output>{{ korDay }}</output>요일!</em>		
		<h4> 나의 친구들 : <span>{{ friends }}</span></h4>		
	</header>
</template>

<script setup>
	import {ref} from 'vue';
	import axios from 'axios';

	const korDay = ref("");
	const friends = ref("");
	axios({
    	url: 'http://localhost:8088/day', // 통신할 웹문서
			method: 'get'    
		}).then(res => {      
			console.log(res);
			console.log(res.data);
			korDay.value = res.data;
		})  
	axios({
    	url: 'http://localhost:8088/friends', // 통신할 웹문서
			method: 'get'    
		}).then(res => {      
			console.log(res);
			console.log(res.data);
		res.data.forEach((elem) => {friends.value += elem.name+" "});
		}) 
</script>