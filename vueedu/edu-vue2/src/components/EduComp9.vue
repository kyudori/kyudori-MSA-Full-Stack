<template>
  <div>
  <h2>Text Input</h2>
  <input v-model="myText"> {{ myText }}

  <h2>Checkbox</h2>
  <input type="checkbox" id="cb" v-model="checked">
  <label for="cb">Checked: {{ checked }}</label>

  <h2>Multi Checkbox</h2>
  <input type="checkbox" id="c1" value="둘리" v-model="checkedNames">
  <label for="c1">둘리</label>
  <input type="checkbox" id="c2" value="또치" v-model="checkedNames">
  <label for="c2">또치</label>
  <input type="checkbox" id="c3" value="도우너" v-model="checkedNames">
  <label for="c3">도우너</label>
  <p>Checked names: {{ checkedNames }}</p>

  <h2>Radio</h2>
  <input type="radio" id="one" value="One" v-model="picked">
  <label for="one">One</label>
  <br>
  <input type="radio" id="two" value="Two" v-model="picked">
  <label for="two">Two</label>
  <br>
  <span>Picked: {{ picked }}</span>

  <h2>Select</h2>
  <select v-model="selected">
    <option disabled value="">Please select one</option>
    <option>A</option>
    <option>B</option>
    <option>C</option>
  </select>
  <span>Selected: {{ selected }}</span>

  <h2>Multi Select</h2>
  <select v-model="multiSelected" multiple style="width:100px">
    <option>A</option>
    <option>B</option>
    <option>C</option>
  </select>
  <span>Selected: {{ multiSelected }}</span>
</div>
</template>

<script>
import { ref } from 'vue'

export default {
  setup() {
    const myText = ref('편집하숑')
    const checked = ref(true)
    const checkedNames = ref(['또치'])
    const picked = ref('One')
    const selected = ref('A')
    const multiSelected = ref(['A'])

    return {
      myText,
      checked,
      checkedNames,
      picked,
      selected,
      multiSelected
    }
  }
}
</script>
