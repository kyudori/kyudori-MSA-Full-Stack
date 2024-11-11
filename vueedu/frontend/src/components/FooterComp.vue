<template>
    <footer>
		<h3 class="target">홈페이지 정보(바닥 글)</h3>
		<h4> 나의 친구들 : <span>{{ friends }}</span></h4>
	</footer>
</template>

<script setup>
	import {ref} from 'vue';
	import axios from 'axios';

	const friends = ref("");
	axios({
    	url: 'http://localhost:8088/friends', // 통신할 웹문서
			method: 'get'    
		}).then(res => {      
			console.log(res);
			console.log(res.data);
		res.data.forEach((elem) => {friends.value += elem.name+" "});
		})  
</script>

<style scoped>
	span {
		color : blue;
	}
</style>