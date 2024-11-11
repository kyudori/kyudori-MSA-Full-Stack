// stores/counter.js
import { defineStore } from 'pinia'
import { ref, computed } from 'vue'

export const useCounterStore = defineStore('counter', () => {
    const count = ref(0);
    const name = ref('유니코');
    const logo = '/images/pinialogo.png';
    
    const myInfo = computed(() => `이름은 ${name.value} 입니다`);
   
    function increment() {
      count.value++
    }
    return { count, name, logo, myInfo, increment }
  },
)

/*
Option API 방식의 스토아 구현
export const useCounterStore = defineStore('counter', {
  state: () => {
    return { count: 0, name: '유니코', logo: '/images/pinialogo.png' }
  },
  getters: {
    myInfo: (state) => {
      return `이름은 ${state.name} 입니다`;
    }
  },
  actions: {
    increment() {
      this.count++
    },
  },
})*/
