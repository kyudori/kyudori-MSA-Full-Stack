import { ref } from 'vue'
import { defineStore } from 'pinia'
import axios from 'axios';

export const useAjaxStore = defineStore('ajax', () => {  
  const friends = ref(""); 
  console.log("스토어 생성 : ", friends.value);
  function getAjaxData() {
    console.log("메서드 호출")
    axios({
    	url: 'http://localhost:8088/friends', // 통신할 웹문서
			method: 'get'    
		}).then(res => res.data.forEach((elem) => { friends.value += elem.name + " "}));    
    console.log("메서드 종료 : ", friends.value);	
  }
  return { friends, getAjaxData }
})
