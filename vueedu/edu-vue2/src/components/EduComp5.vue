<template>
    <h1 @click="updateMessage()">{{ message }}</h1>
</template>
  
<script>
  import { onBeforeMount, onMounted, onBeforeUpdate, onUpdated, ref } from 'vue'
  
  export default {
    setup() {
      const message = ref("클릭하면 변경되는 내용임");  
      onBeforeMount(() => {
        console.log("beforeMount");
      })  
      onMounted(() => {
        console.log("mounted");
      })  
      onBeforeUpdate(() => {
        console.log("beforeUpdate");
      })  
      onUpdated(() => {
        console.log("updated");
      })  
      const updateMessage = () => {
        message.value = "변경 완료됨";
      }  
      return {
        message,
        updateMessage
      }
    }}  
</script>