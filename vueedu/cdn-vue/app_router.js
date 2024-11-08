// 라우트 컴포넌트
import MyComp1 from './components/Comp1.js';
import MyComp2 from './components/Comp2.js';
import MyComp3 from './components/Comp3.js';
import MyComp4 from './components/Comp4.js';
import MyComp5 from './components/Comp5.js';
import MyComp6 from './components/Comp6.js';

const router = VueRouter.createRouter({
  history: VueRouter.createWebHistory(),
  routes: [
    {
      path: "/one",
      component: MyComp1,
    },
    {
      path: "/two",
      component: MyComp2,
    },
    {
      path: "/three",
      component: MyComp3,
    },
    {
      path: "/four",
      component: MyComp4,
    },
    {
      path: "/five",
      component: MyComp5,
    },
    {
      path: "/six",
      component: MyComp6,
    },
  ],
});

Vue.createApp({
  data() {
    return {
      abc: "라우트 학습-2"
    }
  }
}).use(router).mount('#app');
