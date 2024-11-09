<script>
import BasicScope from '@/components/BasicScope21.vue';
export default {
  components: {
    BasicScope,
  },
};
</script>
<template>
  <BasicScope v-slot="slotProps">
    <h1>{{ slotProps.message }} / {{ slotProps.count }}</h1>
  </BasicScope>
</template>
