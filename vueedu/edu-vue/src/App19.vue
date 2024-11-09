<script>
import DynamicLayout from '@/components/DynamicLayout19.vue';
export default {
  components: {
    DynamicLayout,
  },
  data() {
    return {
      dynamicName: 'header',
    };
  },
};
</script>
<template>
  <h1>동적슬롯</h1>
  <hr>
  <h3>슬롯 종류가 다양하네요^^</h3>
  <DynamicLayout>
    <template #[dynamicName]>
      <h2>동적 슬롯</h2>
    </template>
  </DynamicLayout>
</template>
