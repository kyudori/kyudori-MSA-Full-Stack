import { defineStore } from 'pinia'
import { ref } from 'vue'

export const useFriendStore = defineStore('friend', () => {
  const age = ref(10);
  const name = ref('올라프');
  const logo = '/images/pinialogo.png';
  function updateAge(n) {
    age.value+=n;
  }
  return { age, name, logo, updateAge }
})