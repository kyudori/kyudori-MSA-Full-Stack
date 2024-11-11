<template>
    <ul>
      <li v-for="item in items" >
        {{ item.name }}의 가격: <input type="text" v-model="item.price">
      </li> 
    </ul> 
    <hr>
    <div>
      <ul>
        <li v-for="item in items">
        {{ item.name }}: {{ item.price }} x {{ item.quantity }} = {{ item.price * item.quantity }} 원
        </li>
      </ul>
      <p>합계: {{ totalPrice() }} 원</p>
    </div>
  </template>
  
  <script>
  import { ref } from 'vue'
  
  export default {
    setup() {
      const items = ref([
        {
          name: 'CPU', price: 100000, quantity: 1
        }, 
        {
          name: '메인보드', price: 200000, quantity: 1
        }, 
        {
          name: '메모리', price: 80000, quantity: 2
        }
      ])
  
      const totalPrice = () => {
        return items.value.reduce(function (sum, item) {
          return sum + (item.price * item.quantity)
        }, 0)
      }
  
      return {
        items,
        totalPrice,
      }
    },
  }
  </script>