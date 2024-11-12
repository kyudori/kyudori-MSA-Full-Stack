<template>
    <div class="work-view">
      <h1>우리 팀원 정보</h1>
      <div class="card-container">
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
            food: '아이스크림',
            srcUrl: '/images/dooly.jpg',
            teamNum: 1,
            teamName: '먹코살코',
            isShow: true,
          },
          {
            idx: 1,
            name: '장현수',
            food: '떡볶이',
            srcUrl: '/images/ddochi.jpg',
            teamNum: 1,
            teamName: '먹코살코',
            isShow: true,
          },
          {
            idx: 2,
            name: '정지용',
            food: '피자',
            srcUrl: '/images/olaf.jpg',
            teamNum: 1,
            teamName: '먹코살코',
            isShow: true,
          },
          {
            idx: 3,
            name: '한규현',
            food: '핫초코',
            srcUrl: '/images/dauner.png',
            teamNum: 1,
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
  .work-view {
    text-align: center;
    margin: 20px;
  }
  .card-container {
    display: flex;
    flex-wrap: wrap;
    gap: 20px;
    justify-content: center;
  }
  </style>
  
  