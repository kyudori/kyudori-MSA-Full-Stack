<template>
  <div class="form-signin w-100 m-auto">
    <h1 class="h3 mb-3 fw-normal">JWT를 응답헤더로 처리하는 스프링 부트와 연동하는 실습</h1>
    <div class="form-floating">
      <input type="email" class="form-control" id="floatingInput" placeholder="name@example.com"
            @keyup.enter="submit()" v-model="state.form.email">
      <label for="floatingInput">계정(email)</label>
    </div>
    <div class="form-floating">
      <input type="password" class="form-control" id="floatingPassword" placeholder="Password" @keyup.enter="submit()" v-model="state.form.password">
      <label for="floatingPassword">암호</label>
    </div>    
    <button class="w-100 btn btn-lg btn-primary" @click="login()">로그인</button>
    <hr>
    <button class="w-100 btn btn-lg btn-warning" @click="logout()">로그아웃</button>
    <hr>
    <button class="w-100 btn btn-lg btn-danger" @click="check()">로그인 상태 채크</button>
  </div>
</template>

<script>
import {reactive} from "vue";
import axios from "axios";

axios.defaults.withCredentials = true;

export default {
  setup() {
    const state = reactive({
      form: {
        email: "",
        password: ""
      }
    })

    const login = () => {      
      axios.post("http://localhost:8088/api/account/login", state.form, {headers : {"X-Requested-With": "XMLHttpRequest"}}).then((res) => {  
        console.log(res.headers);
        console.log(res.headers.get('Authorization')); // 모두 가능
        console.log(res.headers.get('authorization'));
        console.log(res.headers.authorization);
        console.log(res.headers.getAuthorization());   
        console.log(res.headers['authorization']);
        sessionStorage.setItem("token", res.headers.get('authorization'));
        window.alert(res.data);
      }).catch(() => {
        window.alert("로그인을 수행하는 동안 오류가 발생하였습니다..");
      });
    }

    const logout = () => {      
      axios.get("http://localhost:8088/api/account/logout").then((res) => {
        if (res.headers['authorization'] == 'delete') {
          sessionStorage.removeItem("token")
        }
        window.alert(res.data);
      }).catch(() => {
        window.alert("로그아웃을 수행하는 동안 오류가 발생하였습니다..");
      });
    }

    const check = () => {      
      axios.get("http://localhost:8088/api/account/check",{
            headers: {
              'Authorization': sessionStorage.getItem("token")
            }
          }).then((res) => {       
        window.alert(res.data);
      });
    }

    return {state, login, logout, check}
  }
}
</script>

<style scoped>
.form-signin {
  max-width: 330px;
  padding: 15px;
}

.form-signin .form-floating:focus-within {
  z-index: 2
}

.form-signin input[type="email"] {
  margin-bottom: -1px;
  border-bottom-right-radius: 0;
  border-bottom-left-radius: 0;
}

.form-signin input[type="password"] {
  margin-bottom: 10px;
  border-top-left-radius: 0;
  border-top-right-radius: 0;
}
</style>