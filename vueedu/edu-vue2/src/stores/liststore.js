import { defineStore } from "pinia";
import { reactive, computed } from "vue";

export const useListStore = defineStore("list", () => {
  const list = reactive(['둘리']);
  function addList(param) {
    list.push(param);
  }
  const getDataAll = computed(() => list);
  return { list, addList, getDataAll };
});
