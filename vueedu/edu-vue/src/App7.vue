<script>
import UserProfile from '@/components/UserProfile7.vue';
export default {
  components: {
    UserProfile,
  },
  methods: {
    printHello() {
      alert('안녕하세요!\n[자식컴포넌트에서 전달하는 print-hello 이벤트를 받음]');
    },
  },
};
</script>
<template>
  <UserProfile @print-hello="printHello" />
</template>
