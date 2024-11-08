const BaseCard = {
  props:{
    title: String,
    content: {
      type: String,
      default: "",
      description: "card content"
    },
    buttonText: {
      type: String,
      default: "Ok",
      description: "button text"
    },
    srcUrl: {
      type: String,
      default: "images/dooly.jpg",
      description: "image source url"
    }
  },
  template:`
    <div class="card" style="width: 15rem; margin:5px; display: inline-block">
      <img v-bind:src="srcUrl" class="card-img-top" alt="...">
      <div class="card-body">
        <h5 class="card-title">{{ title }}</h5>
        <p class="card-text">{{ content }}</p>
        <button class="btn btn-primary" @click="hello">{{ buttonText }}</button>
      </div>
    </div>`
  ,
  methods: {
    hello: function() {
      alert(`${this.content}입니다`);
    }
  }
}