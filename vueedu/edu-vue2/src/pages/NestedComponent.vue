<template>
  <div>
    <PageTitle title="props 로 부모 컴포넌트에서 자식 컴포넌트로 데이터 전달" />
    <PageTitle />
    <page-title title="ㅋㅋㅋㅋㅋ"></page-title>
  </div>
</template>
<script>
import PageTitle from '@/components/PageTitle.vue';
export default {
  components: {PageTitle}
}
</script>