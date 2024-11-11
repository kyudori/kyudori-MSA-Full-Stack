<template>
		<h2>옹? 이건 뭐지? 엄청 간단하네!! ㅎㅎ</h2>
		<div>
      {{ date3 }}
		</div>
</template>

<script setup>
	const date3 = Date().toString()
</script>

<style scoped>
	h2 {
		color : red;
	}
</style>
