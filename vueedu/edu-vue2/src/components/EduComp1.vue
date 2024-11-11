<template>
  <div>
    {{ date1 }}
  </div>
  <div>
    {{ date2 }}
  </div>
  </template>

<script>
export default {
  // Composition API
  setup() {    
    return {
      date1: Date().toString()
    }
  },

  // Option API
  data() {
    return {
      date2: Date().toString()
    }
  },
}
</script>

