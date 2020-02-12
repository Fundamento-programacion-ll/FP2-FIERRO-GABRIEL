var arreglo = [1,2,3,4,5];
/*
var arregloString="gabriel";
arreglo.push(6);
console.log(arreglo.length);


for (let index=0;index < arreglo.length; index++){
    const element = arreglo[index];
    console.log(element);
}

console.log(arreglo.length);

arreglo.pop();

console.log(arreglo[3]);

console.log(arreglo.slice(2,4));
console.log(arreglo.shift());
console.log(arreglo.unshift());
console.log(arreglo.reverse());
console.log(arreglo);
var arregloDividido=arreglo.slice(2,4);
console.log(arregloDividido);
arreglo.splice(2,1);
console.log(arreglo);
*/

arreglo.forEach((gabriel, indice) =>{
    console.log(gabriel, indice);
});

var arregloMutado= arreglo.map((elemento,indice)=>{
    return elemento*2;
});
console.log(arregloMutado);
var arregloSome = arreglo.every((e,i)=>{
    return e == 2;
});
console.log(arregloSome);
var arreglox2 =arreglo.map((elemento, indice)=>{
    return elemento*2;
}).some(e =>{
    return e%2 === 0;
})
console.log(arreglox2);

var metododfilter = arreglo.find((elemento, indice)=> {
    return elemento === 2;
});
console.log(metododfilter);

var arreglojson=[
    {nombre:'gabriel' , edad:'13'},
    {nombre:'gabriel1' , edad:'14'},
    {nombre:'gabriel2' , edad:'15'},
    {nombre:'gabriel3' , edad:'16'},
];
let a = 0;
arreglojson.forEach((element,indice)=>{
    return a += element.edad;
});

console.log(a);



