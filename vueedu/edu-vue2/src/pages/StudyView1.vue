<template>
  <div class="study">
    <h1>유니코의 Vue 학습 페이지-1</h1>
  </div>
  <hr />
  <EduComp1></EduComp1>
  <hr />
  <EduComp2></EduComp2>
  <hr />
  <EduComp3></EduComp3>
  <hr />
  <EduComp4></EduComp4>
  <hr />
  <EduComp5></EduComp5>
  <hr />
  <EduComp6></EduComp6>
  <hr />
  <EduComp7></EduComp7>
  <hr />
  <EduComp8></EduComp8>
  <hr />
  <EduComp9></EduComp9>
  <hr />
  <EduComp10></EduComp10>
  <hr />
  <EduComp11></EduComp11>
  <hr />
  <EduComp12></EduComp12>
  <hr />
  <EduComp13></EduComp13>
  <hr />
  <EduComp14></EduComp14>
  <hr />
  <NestedComponent></NestedComponent>
</template>

<script>
// @ is an alias to /src
import EduComp1 from '@/components/EduComp1.vue'
import EduComp2 from '@/components/EduComp2.vue'
import EduComp3 from '@/components/EduComp3.vue'
import EduComp4 from '@/components/EduComp4.vue'
import EduComp5 from '@/components/EduComp5.vue'
import EduComp6 from '@/components/EduComp6.vue'
import EduComp7 from '@/components/EduComp7.vue'
import EduComp8 from '@/components/EduComp8.vue'
import EduComp9 from '@/components/EduComp9.vue'
import EduComp10 from '@/components/EduComp10.vue'
import EduComp11 from '@/components/EduComp11.vue'
import EduComp12 from '@/components/EduComp12.vue'
import EduComp13 from '@/components/EduComp13.vue'
import EduComp14 from '@/components/EduComp14.vue'
import NestedComponent from './NestedComponent.vue'

export default {
  name: 'StudyView1',
  components: {
    EduComp1, EduComp2,
    EduComp3,
    EduComp4,
    EduComp5,
    EduComp6,
    EduComp7,
    EduComp8,
    EduComp9,
    EduComp10,
    EduComp11,
    EduComp12,
    EduComp13,
    EduComp14,
    NestedComponent,
  }
}
</script>

<style>
.study {
  color: blue;
}
</style>
