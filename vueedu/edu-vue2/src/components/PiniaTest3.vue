<template>
  <div>
    <input type="text" v-model="text" />
    <button @click="addList(text)">추가</button>
    <h3>[ 추가된 목록 ]</h3>
    <p v-for="(item, index) in getDataAll">
      {{ item }}
    </p>
  </div>
</template>
<script setup>
  import { ref } from 'vue';
  import { useListStore } from '@/stores/liststore';
  import { storeToRefs } from 'pinia';

  const text = ref("");
  const list = useListStore();
  const { getDataAll } = storeToRefs(list);
      
  function addList() {
    if (!text.value) 
      return;
    list.addList(text.value);
    text.value = "";
  }
</script>
