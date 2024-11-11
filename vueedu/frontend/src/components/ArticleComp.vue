<template>
    <article>
		<router-view :name="areaType"></router-view>
	</article>
</template>

<script setup>
	const props = defineProps(['area']);
	const areaType = props.area;
</script>