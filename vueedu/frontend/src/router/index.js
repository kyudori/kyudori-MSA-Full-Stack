import { createRouter, createWebHistory } from 'vue-router'
import MenuListComp1 from '@/components/MenuListComp1.vue'
import MenuListComp2 from '@/components/MenuListComp2.vue'
import MenuListComp3 from '@/components/MenuListComp3.vue'
const routes = [
    {
        path: '/group-a',
        name: 'first',
        components: { first : MenuListComp1 }
    },
    {
        path: '/group-b',
        name: 'second',
        components: { second: MenuListComp2 }
    },
    {
        path: '/group-c',
        name: 'third',
        components: { third: MenuListComp3 }
    },
    {
        path: '/',
        name: 'forth',
        components: {  }
    },
]

const router = createRouter({
    history: createWebHistory(),
    routes
})

export default router