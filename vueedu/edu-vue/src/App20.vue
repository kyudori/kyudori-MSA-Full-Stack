<script>
import BasicScope from '@/components/BasicScope20.vue';
import BasicScope2 from '@/components/BasicScope20_1.vue';
export default {
  components: {
    BasicScope,
    BasicScope2,
  },
  data() {
    return {
      message: 'parent',
      count: 0,
    };
  },
};
</script>
<template>
  <BasicScope>
    <h1>범위</h1>
  </BasicScope>
  <hr>
  <BasicScope2>
    <h1>범위: {{ message }} / {{ count }}</h1>
  </BasicScope2>
</template>
<style scoped>
h1 {
  color: blue;
}
</style>
