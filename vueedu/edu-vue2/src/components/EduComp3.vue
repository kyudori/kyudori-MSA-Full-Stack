<template>
	<h4>Setup API 형식에서는 기본형 데이터가 반응성을 가질려면 ref() 함수로 포장해야 함</h4>
	<div>
		<button @click="increment()">Counter: {{ counter }}</button>
	</div>
</template>

<script>
import { onMounted, ref } from 'vue';

export default {
	setup() {
		const counter = ref(0); // 
		const increment = () => counter.value++;
		onMounted(() => {
			console.log('애플리케이션이 마운트 되었습니다!');
		});
		return {
			counter,
			increment,
		};
	},
};
</script>