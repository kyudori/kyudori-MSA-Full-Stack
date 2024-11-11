<script>
import FirstChild from "@/components/FirstChild1.vue";
export default {
  components: {
    FirstChild,
  },
};
</script>
<template>
  <FirstChild />
</template>
<style scoped>
/* 이 스타일 tag 내용은 이 컴포넌트로 한정한다 */
h1,
p {
  color: orange !important;
}
</style>
