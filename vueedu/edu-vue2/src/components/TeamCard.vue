<template>
    <div class="card" style="width: 18rem;margin: auto;" v-show="isShow" :key="idx">
        <img v-bind:src="srcUrl" class="card-img-top" width="70" height="200" alt="...">
        <div class="card-body">
            <h5 class="card-title">{{ name }}</h5>
            <p class="card-text">{{ food }}</p>
            <button class="btn btn-primary" @click="handleClick">OK</button>
        </div>
    </div>
</template>
<script setup>
    import { defineProps, defineEmits } from 'vue';
    const emit = defineEmits(["delete-card"]);
    const p = defineProps({
        name : String,
        food : {
            type: String,
            default: "떡볶이"            
        },
        srcUrl: String,
        teamNum : Number,
        teamName : String,
        isShow : Boolean,
        idx: Number
    });
    
    function handleClick() {
        alert(`${p.teamNum}팀 입니다~~~!! 우리팀 이름은 ${p.teamName}에요`); 
        emit("delete-card", p.idx)       
    }
</script>

<style>
    img {
        height : 200px;
    }
</style>
