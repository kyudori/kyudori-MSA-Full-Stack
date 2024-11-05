let coffee = "Americano";

let getCoffee = function(){
	return coffee.toUpperCase()
};

let setCoffee = function(newValue){
	coffee = newValue
};

export {coffee, getCoffee, setCoffee};
