const names=["qiniso","mo","Tshepo"];

const capitalizedNames = names.map(name =>{
    return name.charAt(0).toUpperCase() + name.slice(1);
})

console.log("Transformed String:", capitalizedNames);
console.log("Original Strings:",names);