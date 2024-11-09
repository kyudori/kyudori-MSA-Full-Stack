<script>
import MixLayout from '@/components/MixLayout17.vue';
export default {
  components: {
    MixLayout,
  },
};
</script>
<template>
  <MixLayout>
    <h2>나는 어디로?</h2>
    <template #header>
      <header>
        <h1>Header</h1>
      </header>
    </template>
    <!-- default -->
    <main>
      <h1>Main</h1>
    </main>
    <hr>
    <template #footer>
      <footer>
        <h1>Footer</h1>
      </footer>
    </template>
    <h2>나도 어디로?</h2>
  </MixLayout>
</template>
