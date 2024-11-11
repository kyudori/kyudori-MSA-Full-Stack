<template>
	<header-comp/>	
	<nav-comp/>	
	<section-comp/>
	<footer-comp/>	
</template>

<script setup>
import HeaderComp from './components/HeaderComp.vue'
import NavComp from './components/NavComp.vue'
import SectionComp from './components/SectionComp.vue'
import FooterComp from './components/FooterComp.vue'
</script> 

<style>
	@font-face {
    font-family: 'KCCMurukmuruk';
    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_2302@1.0/KCCMurukmuruk.woff2') format('woff2');
    font-weight: normal;
    font-style: normal;
	}
  * {
		margin : 0;
		font-family: 'KCCMurukmuruk';
	}
	header {
		width : 100%;
		height : 100px;
		background-color : yellow;
		text-align : center;
		padding-top : 10px		
	}
	
	nav {
		width : 30%;
		height : 400px;
		float : left;
		background-color : pink;
	}
	
	div {
		padding : 10px;
	}
	section {
		width : 70%;
		height : 400px;
		float : right;
		background-color : skyblue;
	}
	article {
		width : 80%;
		height : 120px;
		background-color : magenta;
		margin : 10px auto;
		text-align : center;
	}
	footer {
		width : 100%;
		height : 50px;		
		clear : both;
		background-color : lightgray;
	}
	h4 {
		color : blue;
	}
</style>
