<template>
    <header>	
		<h1 class="target">레이아웃 나누기(스토어 활용)</h1>
		<em>오늘은 <output>{{ korDay }}</output>요일!</em>		
		<h4> 나의 친구들 : <span>{{ friends }}</span></h4>		
	</header>
</template>

<script setup>
	import {ref} from 'vue';
	import axios from 'axios';
	import { storeToRefs } from 'pinia';
	import { useAjaxStore } from '@/stores/ajaxStore'
	const store = useAjaxStore();	
	const { friends } = storeToRefs(store);
	const korDay = ref("");

	axios({
    	url: 'http://localhost:8088/day', // 통신할 웹문서
			method: 'get'    
	}).then(res => {      
				korDay.value = res.data;
	});  
</script>