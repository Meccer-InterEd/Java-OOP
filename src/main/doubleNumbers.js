const numbers=[1,2,3,4];

const doubled = numbers.map(num => num * 2);

console.log("Doubled Array:", doubled);
console.log("original Array",numbers);


const numbers=[5,5,6,7];
const doubled=[];

for(let i=0; i< numbers.length; i++){
const currentResult = numbers[i] * 2;

doubled.push(currentResult);
}
console.log("Doubled Array:", doubled);
console.log("original Array",numbers);
