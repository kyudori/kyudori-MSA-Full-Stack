<template>
    <div class="work">
      <h1>우리 팀원 정보</h1>
      <div class="card-box">
        <TeamCard
          v-for="(member, index) in teamMembers"
          :key="member.idx"
          :name="member.name"
          :food="member.food"
          :srcUrl="member.srcUrl"
          :teamNum="member.teamNum"
          :teamName="member.teamName"
          :isShow="member.isShow"
          :idx="index"
          @delete-card="removeCard"
        />
      </div>
    </div>
  </template>
  
  <script>
  import TeamCard from '@/components/TeamCard.vue';
  
  export default {
    name: 'WorkView',
    components: {
      TeamCard,
    },
    data() {
      return {
        teamMembers: [
          {
            idx: 0,
            name: '김슬기',
            food: '고구마',
            srcUrl: '/images/dooly.jpg',
            teamNum: 1,
            teamName: '먹코살코',
            isShow: true,
          },
          {
            idx: 1,
            name: '장현수',
            food: '떡갈비',
            srcUrl: '/images/ddochi.jpg',
            teamNum: 2,
            teamName: '먹코살코',
            isShow: true,
          },
          {
            idx: 2,
            name: '정지용',
            food: '갈비탕',
            srcUrl: '/images/olaf.jpg',
            teamNum: 2,
            teamName: '먹코살코',
            isShow: true,
          },
          {
            idx: 3,
            name: '한규현',
            food: '밥',
            srcUrl: '/images/dauner.png',
            teamNum: 2,
            teamName: '먹코살코',
            isShow: true,
          },
        ],
      };
    },
    methods: {
      removeCard(index) {
        this.teamMembers[index].isShow = false;
      },
    },
  };
  </script>
  
  <style>
  .work {
    text-align: center;
    margin: 20px;
    color: rgb(255, 51, 0);
  }
  
  .card-box {
    margin-top: 50px;
    display: flex;
  }
  </style>
  