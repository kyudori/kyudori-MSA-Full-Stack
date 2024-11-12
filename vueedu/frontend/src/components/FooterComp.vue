<template>
    <footer>
		<h3 class="target">홈페이지 정보(바닥 글)</h3>
		<h4> 나의 친구들 : <span>{{ friends }}</span></h4>
	</footer>
</template>

<script setup>
	import { storeToRefs } from 'pinia';
	import { useAjaxStore } from '@/stores/ajaxStore'
	const store = useAjaxStore();	
	const { friends } = storeToRefs(store);	
</script>

<style scoped>
	span {
		color : brown;
	}
</style>